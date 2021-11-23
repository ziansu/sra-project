public boolean execute(java.lang.String instanceId) {
    logger.info("ScaleUpPublishAction executing");
    java.lang.String authorAemBaseUrl = aemHelperService.getAemUrlForAuthorElb();
    java.lang.String publishAemBaseUrl = aemHelperService.getAemUrlForPublish(instanceId);
    boolean success = pairAndTagWithDispatcher(instanceId, authorAemBaseUrl);
    if (success) {
        success = prepareReplicationAgent(instanceId, authorAemBaseUrl, publishAemBaseUrl);
    }
    if (success) {
        success = loadSnapshotFromActivePublisher(instanceId, authorAemBaseUrl);
    }
    return success;
}