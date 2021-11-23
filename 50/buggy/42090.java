@java.lang.Override
protected void suspend(java.lang.String reason) {
    if (((currentContext) == null) && ((vm) != null)) {
        suspendReason = reason;
        vm.suspend(null);
    }
}