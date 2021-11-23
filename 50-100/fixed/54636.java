public void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    com.google.zxing.integration.android.IntentResult result = com.google.zxing.integration.android.IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
    if (result != null) {
        java.lang.String contents = result.getContents();
        barcode = contents;
        if (contents != null)
            new com.example.michaelh.fridgeapp.MainActivity.GetDataOnline().execute();
        
    }
}