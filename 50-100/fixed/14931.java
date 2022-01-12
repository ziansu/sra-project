@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    java.lang.System.out.println("never here");
    com.google.zxing.integration.android.IntentResult scanResult = com.google.zxing.integration.android.IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
    if (scanResult != null) {
        android.widget.Toast.makeText(getActivity(), scanResult.getContents(), Toast.LENGTH_LONG).show();
        getData(scanResult.getContents());
    }
}