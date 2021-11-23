@org.junit.Test
public void testExecute_WhenSDNReturnsNullNetworkElement_ThrowsVmidcException() throws java.lang.Exception {
    org.osc.core.broker.service.tasks.conformance.k8s.securitygroup.CreateK8sLabelPodTask task = this.factoryTask.create(org.osc.core.broker.service.tasks.conformance.k8s.securitygroup.NETWORK_ELEMENT_NOT_FOUND_K8S_POD, org.osc.core.broker.service.tasks.conformance.k8s.securitygroup.NETWORK_ELEMENT_NOT_FOUND_POD_SGM_LABEL);
    registerNetworkElement(org.osc.core.broker.service.tasks.conformance.k8s.securitygroup.NETWORK_ELEMENT_NOT_FOUND_POD_SGM_LABEL.getSecurityGroupMembers().iterator().next(), null, org.osc.core.broker.service.tasks.conformance.k8s.securitygroup.NETWORK_ELEMENT_NOT_FOUND_K8S_POD);
    this.exception.expect(org.osc.core.broker.service.exceptions.VmidcException.class);
    this.exception.expectMessage("The SDN controller did not return a network element for the device");
    task.execute();
}