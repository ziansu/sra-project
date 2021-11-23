@javax.annotation.PostConstruct
protected void setupSupportedVpcHypervisorsList() {
    hTypes.add(HypervisorType.XenServer);
    hTypes.add(HypervisorType.VMware);
    hTypes.add(HypervisorType.KVM);
    hTypes.add(HypervisorType.Simulator);
    hTypes.add(HypervisorType.LXC);
    hTypes.add(HypervisorType.Hyperv);
    hTypes.add(HypervisorType.Ovm3);
}