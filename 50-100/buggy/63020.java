@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    com.google.zxing.integration.android.IntentResult scanResult = com.google.zxing.integration.android.IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
    if (null != scanResult) {
        android.widget.Toast.makeText(this, scanResult.getContents(), Toast.LENGTH_LONG).show();
        final java.lang.String ean = scanResult.getContents();
        it.jaschke.alexandria.AddBook fragment = ((it.jaschke.alexandria.AddBook) (getSupportFragmentManager().findFragmentById(R.id.container)));
        if (null != fragment) {
            fragment.fetchBook(ean);
        }
    }
}