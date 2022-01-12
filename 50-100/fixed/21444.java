public void waitForFinish() throws java.lang.InterruptedException {
    try {
        for (; ;) {
            java.lang.Thread.sleep(HttpPyramidConstants.SYSTEM_COMMANDS_DELAY);
            if (java.nio.file.Files.exists(finishKeyFile())) {
                try {
                    proxy.finish();
                    java.lang.Thread.sleep(HttpPyramidConstants.SYSTEM_COMMANDS_DELAY_AFTER_FINISH);
                } finally {
                    java.nio.file.Files.deleteIfExists(finishKeyFile());
                }
                break;
            }
        }
    } catch (java.io.IOException e) {
        throw new java.io.IOError(e);
    }
    net.algart.pyramid.http.proxy.HttpPyramidProxyServer.LOG.info(("Finishing " + (proxy)));
}