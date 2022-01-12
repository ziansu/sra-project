@java.lang.Override
public void process(us.codecraft.webmagic.Page page) {
    try {
        if (page == null) {
            throw new java.lang.Exception("page is null");
        }
        for (movie.PageProcessor.ConcreteProcessor.BaseProcessor processor : processors) {
            if (processor.accept(page)) {
                processor.process(page);
            }
        }
    } catch (java.lang.Exception e) {
        movie.PageProcessor.DoubanMoviePageProcessorB.logger.warn(e.getStackTrace().toString());
    }
}