public org.killbill.billing.plugin.notification.email.EmailContent generateEmailForFailedPayment(final org.killbill.billing.account.api.AccountData account, final org.killbill.billing.invoice.api.Invoice invoice, final org.killbill.billing.util.callcontext.TenantContext context) throws java.io.IOException {
    return getEmailContent(TemplateType.FAILED_PAYMENT, account, null, invoice, context);
}