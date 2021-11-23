private void closePageExplicitly() {
    page.cleanUp();
    final java.util.List<com.gargoylesoftware.htmlunit.WebWindow> windows = webClient.getWebWindows();
    for (final com.gargoylesoftware.htmlunit.WebWindow wd : windows) {
        wd.getJobManager().removeAllJobs();
        webClient.deregisterWebWindow(wd);
    }
    page = null;
    java.lang.System.gc();
}