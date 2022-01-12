@java.lang.Override
protected boolean suspend(java.lang.String reason) {
    if (((currentContext) == null) && ((vm) != null)) {
        suspendReason = reason;
        vm.suspend(null);
        return true;
    }
    return false;
}