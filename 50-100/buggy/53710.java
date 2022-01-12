public java.util.Optional<java.lang.Integer> getDisk(java.lang.String hyperVisorName) {
    for (org.openstack4j.model.compute.ext.Hypervisor hyperVisor : admin.compute().hypervisors().list()) {
        if (hyperVisor.getHypervisorHostname().split(".")[0].equals(hyperVisorName)) {
            return java.util.Optional.ofNullable(hyperVisor.getLocalDisk());
        }
    }
    return java.util.Optional.empty();
}