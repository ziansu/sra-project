private com.cloud.user.Account getCaller() {
    com.cloud.user.Account caller = org.apache.cloudstack.context.CallContext.current().getCallingAccount();
    return caller;
}