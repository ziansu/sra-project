protected void preSearchCalled(org.ovirt.engine.core.common.businessentities.VM vm) {
    setSearchString(("events: vm.name=" + (vm.getName())));
}