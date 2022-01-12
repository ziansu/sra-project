@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (it.jaschke.alexandria.AddBook.SCAN_REQUEST)) {
        if (resultCode == (android.app.Activity.RESULT_OK)) {
            if (data.hasExtra(ScanActivity.RESULT_STRING)) {
                java.lang.String result = data.getExtras().getString(ScanActivity.RESULT_STRING);
                ean.setText(result);
            }
        }
    }
}