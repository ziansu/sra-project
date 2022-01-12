@java.lang.Override
public void enable() {
    vm.checkAlreadyDefinedClassesForRequest(this);
    entryRequest.enable();
}