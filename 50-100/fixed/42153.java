@java.lang.Override
public boolean apply(final org.killbill.billing.payment.dao.PaymentTransactionModelDao input) {
    return (((input.getTransactionStatus()) == (org.killbill.billing.payment.api.TransactionStatus.SUCCESS)) || (((paymentStateContext.getPaymentId()) != null) && ((input.getPaymentId().compareTo(paymentStateContext.getPaymentId())) != 0))) || (!(input.getAccountRecordId().equals(paymentStateContext.getInternalCallContext().getAccountRecordId())));
}