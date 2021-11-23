@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.Intent scanIntent = new android.content.Intent(this, io.card.payment.CardIOActivity.class);
    scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_EXPIRY, CardIOPlugin.expiry);
    scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_CVV, CardIOPlugin.cvv);
    scanIntent.putExtra(CardIOActivity.EXTRA_REQUIRE_POSTAL_CODE, CardIOPlugin.zip);
    scanIntent.putExtra(CardIOActivity.EXTRA_SUPPRESS_CONFIRMATION, CardIOPlugin.confirm);
    scanIntent.putExtra(CardIOActivity.EXTRA_SUPPRESS_MANUAL_ENTRY, CardIOPlugin.suppressManual);
    scanIntent.putExtra(CardIOActivity.EXTRA_USE_CARDIO_LOGO, CardIOPlugin.showLogo);
    startActivityForResult(scanIntent, com.velocitywebworks.plugins.cardio.CardIOMain.MY_SCAN_REQUEST_CODE);
}