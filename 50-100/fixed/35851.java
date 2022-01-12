private void fetchTexts(jem.core.Chapter chapter, java.util.concurrent.CountDownLatch latch, java.util.concurrent.ExecutorService pool) {
    if (!(chapter.isSection())) {
        lombok.val text = chapter.getText();
        if (text instanceof jem.crawler.CrawlerText) {
            pool.submit(new jem.crawler.CrawlerBook.FetchTask(((jem.crawler.CrawlerText) (text)), latch));
        }
    }else {
        for (lombok.val sub : chapter) {
            fetchTexts(sub, latch, pool);
        }
    }
}