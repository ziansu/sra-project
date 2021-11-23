private void payWithNewCard() {
    android.content.Intent scanIntent = new android.content.Intent(this, io.card.payment.CardIOActivity.class);
    scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, true);
    scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_CVV, true);
    scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_POSTAL_CODE, false);
    startActivityForResult(scanIntent, ly.kite.checkout.PaymentActivity.REQUEST_CODE_CREDITCARD);
}