@java.lang.Override
public int getMaxRawUsagePreviousPeriod(final org.killbill.billing.callcontext.InternalTenantContext tenantContext) {
    final java.lang.reflect.Method method = new java.lang.Object() {    }.getClass().getEnclosingMethod();
    final java.lang.String result = getStringTenantConfig(method.getName(), tenantContext);
    if (result != null) {
        return java.lang.Integer.parseInt(result);
    }
    return getMaxRawUsagePreviousPeriod();
}