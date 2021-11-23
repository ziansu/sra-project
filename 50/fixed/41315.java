private boolean isLegal(com.ndpmedia.rocketmq.cockpit.scheduler.TopicAvailability topicAvailability, java.util.List<com.ndpmedia.rocketmq.cockpit.scheduler.DataCenter> allowedDataCenters) {
    for (com.ndpmedia.rocketmq.cockpit.scheduler.DataCenter dataCenter : allowedDataCenters) {
        if ((dataCenter.getId()) == (topicAvailability.getDcId())) {
            return false;
        }
    }
    return true;
}