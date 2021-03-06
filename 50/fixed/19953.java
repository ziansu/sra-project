private void startServices() throws net.segoia.commons.exceptions.ContextAwareException {
    net.segoia.distributed.framework.ProcessingNode.logger.info("Starting services");
    for (net.segoia.distributed.framework.DistributedService ds : localServices.values()) {
        ds.start();
    }
}