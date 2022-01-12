public void reinitIfClosed() {
    if (io.parallec.core.ParallelClient.isClosed.get()) {
        io.parallec.core.ParallelClient.logger.info("External Resource was released. Now Re-initializing resources ...");
        io.parallec.core.actor.ActorConfig.createAndGetActorSystem();
        httpClientStore.reinit();
        tcpSshPingResourceStore.reinit();
        try {
            java.lang.Thread.sleep(1000L);
        } catch (java.lang.InterruptedException e) {
            io.parallec.core.ParallelClient.logger.error("error reinit httpClientStore", e);
        }
        io.parallec.core.ParallelClient.isClosed.set(false);
        io.parallec.core.ParallelClient.logger.info("Parallel Client Resources has been reinitialized.");
    }else {
        io.parallec.core.ParallelClient.logger.debug("NO OP. Resource was not released.");
    }
}