@javax.annotation.PostConstruct
protected void setupSupportedVpcHypervisorsList() {
    this.hTypes.add(HypervisorType.XenServer);
    this.hTypes.add(HypervisorType.VMware);
    this.hTypes.add(HypervisorType.KVM);
    this.hTypes.add(HypervisorType.Simulator);
    this.hTypes.add(HypervisorType.LXC);
    this.hTypes.add(HypervisorType.Hyperv);
    this.hTypes.add(HypervisorType.Ovm3);
}