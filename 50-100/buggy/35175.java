@java.lang.Override
public void onResult(com.mobvoi.android.wearable.DataApi.DataItemResult result) {
    if (result.getStatus().isSuccess()) {
        java.lang.String h = "" + (com.mobvoi.android.test.Utils.getHashCode(result.getDataItem().getData()));
        if (h.equals(fh)) {
            com.mobvoi.android.test.Utils.setText(this, "send", ("S:" + h));
        }
    }
}