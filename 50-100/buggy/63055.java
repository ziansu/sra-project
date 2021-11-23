public java.util.Optional<java.lang.Integer> getCPU(java.lang.String hyperVisorName) {
    for (org.openstack4j.model.compute.ext.Hypervisor hyperVisor : admin.compute().hypervisors().list()) {
        if (hyperVisor.getHypervisorHostname().split(".")[0].equals(hyperVisorName)) {
            log.info(("CPU: " + (hyperVisor.getVirtualCPU())));
            return java.util.Optional.ofNullable(hyperVisor.getVirtualCPU());
        }
    }
    return java.util.Optional.empty();
}