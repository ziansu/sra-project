public void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    com.google.zxing.integration.android.IntentResult scan = com.google.zxing.integration.android.IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
    if (scan != null) {
        java.lang.String cont = scan.getContents();
        ((android.widget.EditText) (findViewById(R.id.search))).setText(cont);
        issueSearch(cont);
    }
}