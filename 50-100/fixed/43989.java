@java.lang.Override
public java.util.List<java.lang.String> getPaymentControlPluginNames(@org.skife.config.Param(value = "dummy")
final org.killbill.billing.callcontext.InternalTenantContext tenantContext) {
    final java.lang.reflect.Method method = new java.lang.Object() {    }.getClass().getEnclosingMethod();
    final java.lang.String result = getStringTenantConfig(method.getName(), tenantContext);
    if (result != null) {
        return convertToListString(result, method.getName());
    }
    return getPaymentControlPluginNames();
}