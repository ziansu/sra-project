@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.google.zxing.integration.android.IntentIntegrator.REQUEST_CODE)) {
        com.google.zxing.integration.android.IntentResult result = com.google.zxing.integration.android.IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if ((result != null) && ((result.getContents()) != null)) {
            java.lang.String contents = result.getContents();
            android.util.Log.d(it.jaschke.alexandria.AddBook.TAG, contents);
        }else {
        }
    }else {
        super.onActivityResult(requestCode, resultCode, data);
    }
}