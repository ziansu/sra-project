org.osc.core.broker.service.tasks.conformance.k8s.securitygroup.CreateK8sLabelPodTask create(org.osc.core.broker.rest.client.k8s.KubernetesPod k8sPod, org.osc.core.broker.model.entities.virtualization.k8s.Label label, org.osc.core.broker.model.plugin.ApiFactoryService apiFactoryService) {
    org.osc.core.broker.service.tasks.conformance.k8s.securitygroup.CreateK8sLabelPodTask task = new org.osc.core.broker.service.tasks.conformance.k8s.securitygroup.CreateK8sLabelPodTask();
    task.k8sPod = k8sPod;
    task.label = label;
    task.apiFactoryService = apiFactoryService;
    task.dbConnectionManager = this.dbConnectionManager;
    task.txBroadcastUtil = this.txBroadcastUtil;
    return task;
}