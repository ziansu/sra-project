public void scale(ch.sbb.cloud.autoscaler.model.actionevents.ActionEvent actionEvent) {
    java.lang.Long minReplicas = actionEvent.minReplicas;
    java.lang.Long maxReplicas = actionEvent.maxReplicas;
    java.lang.Integer currentReplicas = getReplicasForService(actionEvent.project, actionEvent.service);
    int newNumberOfReplicas = newNumberOfReplicas(actionEvent.scale, currentReplicas);
    if ((newNumberOfReplicas >= minReplicas) && (newNumberOfReplicas <= maxReplicas)) {
        ch.sbb.cloud.autoscaler.service.OcScaleClient.LOG.info("Scaling {}:{} to {}", actionEvent.project, actionEvent.service, newNumberOfReplicas);
        setReplicasForService(actionEvent.project, actionEvent.service, newNumberOfReplicas);
    }else {
        ch.sbb.cloud.autoscaler.service.OcScaleClient.LOG.info("No scaling required for {}:{}. Replicas:{}, min:{}, max:{}", actionEvent.project, actionEvent.service, currentReplicas, minReplicas, maxReplicas);
    }
}