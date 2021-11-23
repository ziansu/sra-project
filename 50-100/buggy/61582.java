@java.lang.Override
public org.skife.config.TimeSpan getDryRunNotificationSchedule(final org.killbill.billing.callcontext.InternalTenantContext tenantContext) {
    final java.lang.reflect.Method method = new java.lang.Object() {    }.getClass().getEnclosingMethod();
    final java.lang.String result = getStringTenantConfig(method.getName(), tenantContext);
    if (result != null) {
        return new org.skife.config.TimeSpan(result);
    }
    return staticConfig.getDryRunNotificationSchedule(tenantContext);
}