@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError volleyError) {
    if ((dialog) != null) {
        dialog.dismiss();
    }
    android.os.Message msg = new android.os.Message();
    msg.what = HttpSet.httpNull;
    msg.obj = tag;
    handler.sendMessage(msg);
    snackBar.show(context.getString(R.string.base_toast_net_worse));
    queue.stop();
}