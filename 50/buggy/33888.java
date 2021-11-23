@java.lang.Override
public void onChargeSuccess(ly.kite.payment.PayPalCard card, java.lang.String proofOfPayment) {
    ly.kite.analytics.Analytics.getInstance(this).trackPaymentCompleted(mPrintOrder, Analytics.PAYMENT_METHOD_CREDIT_CARD);
    dialog.dismiss();
    submitOrderForPrinting(proofOfPayment);
    card.saveAsLastUsedCard(this);
}