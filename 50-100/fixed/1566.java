@java.lang.Override
protected void shutdownInternal() {
    if (null != (timer)) {
        timer.cancel();
        timer = null;
    }
    if ((null != (parser)) && ((parser) instanceof com.gj.web.crawler.lifecycle.Lifecycle)) {
        ((com.gj.web.crawler.lifecycle.Lifecycle) (parser)).shutdown();
    }
    if ((medias.size()) > 0) {
        mediaDownloaded(medias);
    }
}