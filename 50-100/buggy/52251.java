public void fetchLastApp() {
    if (needFetch) {
        try {
            java.lang.Thread.sleep(2000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        JsonUtils.ContainerJsonFetcher containerJsonFetcher;
        for (Server.App app : applications.values()) {
            if (app.fetched = false) {
                containerJsonFetcher = new JsonUtils.ContainerJsonFetcher(conf, app, containerToReport);
                containerJsonFetcher.fetch();
                app.fetched = true;
            }
        }
    }
    containerToReport.clear();
    needFetch = false;
}