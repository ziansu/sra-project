private boolean nodePortAvailable(java.util.List<org.apache.stratos.cloud.controller.iaases.kubernetes.Service> services, int nodePort) throws org.apache.stratos.kubernetes.client.exceptions.KubernetesClientException {
    for (org.apache.stratos.cloud.controller.iaases.kubernetes.Service service : services) {
        for (org.apache.stratos.cloud.controller.iaases.kubernetes.ServicePort servicePort : service.getSpec().getPorts()) {
            if ((servicePort.getNodePort()) == nodePort) {
                return false;
            }
        }
    }
    return true;
}