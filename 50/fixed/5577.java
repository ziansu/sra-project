public java.util.List<cws.core.VM> getAvailableVMs() {
    return new java.util.ArrayList<cws.core.VM>(provisioner.getCloud().getAvailableVMs());
}