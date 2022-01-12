@java.lang.Override
public void onReceiveResult(int resultCode, android.os.Bundle resultData) {
    if (resultData != null) {
        if (resultCode == (RationaleDialog.PERMISSION_RESOLVE)) {
            setResult(resultCode, new android.content.Intent().putExtra("data", resultData));
            finish();
        }
    }else {
        finish();
    }
}