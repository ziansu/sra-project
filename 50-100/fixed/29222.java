@java.lang.Override
public void onResult(com.mobvoi.android.wearable.DataApi.GetFdForAssetResult result) {
    if (result.getStatus().isSuccess()) {
        java.io.InputStream in = result.getInputStream();
        java.lang.String f = "" + (com.mobvoi.android.test.Utils.readAll(in));
        if (f.equals(fh)) {
            com.mobvoi.android.test.Utils.setText(this, "send", f);
        }
    }
}