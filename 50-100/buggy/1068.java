@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    switch (requestCode) {
        case it.jaschke.alexandria.AddBook.ZBAR_SCANNER_REQUEST :
            if (resultCode == (com.dm.zbar.android.scanner.ZBarScannerActivity.RESULT_OK)) {
                if ((ean) != null) {
                    ean.setText(data.getStringExtra(ZBarConstants.SCAN_RESULT));
                }
            }else {
                java.lang.String error = data.getStringExtra(ZBarConstants.ERROR_INFO);
                android.widget.Toast.makeText(getActivity(), error, Toast.LENGTH_SHORT).show();
            }
    }
}