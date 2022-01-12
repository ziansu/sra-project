@java.lang.Override
public org.killbill.billing.payment.dispatcher.PluginDispatcher.PluginDispatcherReturnType<org.killbill.billing.payment.plugin.api.GatewayNotification> call() throws org.killbill.billing.payment.api.PaymentApiException {
    final org.killbill.billing.payment.plugin.api.PaymentPluginApi plugin = getPaymentPluginApi(pluginName);
    try {
        final org.killbill.billing.payment.plugin.api.GatewayNotification result = plugin.processNotification(notification, properties, callContext);
        return org.killbill.billing.payment.dispatcher.PluginDispatcher.createPluginDispatcherReturnType((result == null ? new org.killbill.billing.payment.provider.DefaultNoOpGatewayNotification() : result));
    } catch (final org.killbill.billing.payment.plugin.api.PaymentPluginApiException e) {
        throw new org.killbill.billing.payment.api.PaymentApiException(org.killbill.billing.ErrorCode.PAYMENT_PLUGIN_EXCEPTION, e.getErrorMessage());
    }
}