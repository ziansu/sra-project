@org.springframework.scheduling.annotation.Async
private void start(java.lang.String url) {
    if (!(com.prapps.app.core.controller.CoreController.keepAlive)) {
        com.prapps.app.core.controller.CoreController.keepAlive = true;
        while (com.prapps.app.core.controller.CoreController.keepAlive) {
            try {
                new java.net.URL(url).openConnection();
                java.lang.Thread.sleep((((1000 * 60) * 60) * 12));
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        } 
    }
}