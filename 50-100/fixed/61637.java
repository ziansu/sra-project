public void scale(ch.sbb.cloud.autoscaler.model.actionevents.ActionEvent actionEvent) {
    java.lang.Integer currentReplicas = getReplicasForService(actionEvent.project, actionEvent.service);
    long newNumberOfReplicas = newNumberOfReplicas(actionEvent, currentReplicas);
    if (newNumberOfReplicas != currentReplicas) {
        ch.sbb.cloud.autoscaler.service.OcScaleClient.LOG.info("Scaling {}:{} to {}", actionEvent.project, actionEvent.service, newNumberOfReplicas);
        setReplicasForService(actionEvent.project, actionEvent.service, newNumberOfReplicas);
    }else {
        ch.sbb.cloud.autoscaler.service.OcScaleClient.LOG.info("No scaling required for {}:{}. Replicas:{}, min:{}, max:{}", actionEvent.project, actionEvent.service, currentReplicas, actionEvent.minReplicas, actionEvent.maxReplicas);
    }
}