@java.lang.Override
protected void addRequest(us.codecraft.webmagic.Request request) {
    try {
        java.net.URL url = new java.net.URL(request.getUrl());
        if ((isAllowedFromRobots(url)) != null) {
            super.addRequest(request);
        }
    } catch (java.net.MalformedURLException e) {
        logger.error(("Unable to parse URL =" + (request.getUrl())));
    }
}