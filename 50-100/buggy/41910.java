public boolean execute(java.lang.String instanceId) {
    logger.info("ScaleUpPublishAction executing");
    java.lang.String authorAemBaseUrl = aemHelperService.getAemUrlForAuthorElb();
    java.lang.String publishAemBaseUrl = aemHelperService.getAemUrlForPublish(instanceId);
    boolean success = prepareReplicationAgent(instanceId, authorAemBaseUrl, publishAemBaseUrl);
    if (success) {
        success = loadSnapshotFromActivePublisher(instanceId, authorAemBaseUrl);
    }
    if (success) {
        success = pairAndTagWithDispatcher(instanceId, authorAemBaseUrl);
    }
    return success;
}