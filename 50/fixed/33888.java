@java.lang.Override
public void onChargeSuccess(ly.kite.payment.PayPalCard card, java.lang.String proofOfPayment) {
    dialog.dismiss();
    submitOrderForPrinting(proofOfPayment);
    card.saveAsLastUsedCard(this);
}