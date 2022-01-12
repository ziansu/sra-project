public void stop() {
    com.google.gwt.query.client.GQuery.$(com.google.gwt.query.client.GQuery.window).off("popstate", this.checkUrl);
    com.google.gwt.query.client.GQuery.$(com.google.gwt.query.client.GQuery.window).off("hashchange", this.checkUrl);
    if ((checkUrlInterval) != null) {
        checkUrlInterval.cancel();
        checkUrlInterval = null;
    }
    org.lirazs.gbackbone.client.core.navigation.History.started = false;
}