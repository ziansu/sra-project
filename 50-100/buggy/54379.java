private void onDownloadSuccess(us.codecraft.webmagic.Request request, us.codecraft.webmagic.Page page) {
    onSuccess(request);
    if (site.getAcceptStatCode().contains(page.getStatusCode())) {
        pageProcessor.process(page);
        extractAndAddRequests(page, spawnUrl);
        if (!(page.getResultItems().isSkip())) {
            for (us.codecraft.webmagic.pipeline.Pipeline pipeline : pipelines) {
                pipeline.process(page.getResultItems(), this);
            }
        }
    }
    sleep(site.getSleepTime());
    return ;
}