@java.lang.Override
public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    if (!(android.text.TextUtils.equals("N/A", msg.getData().getString("title")))) {
        toolbar.setTitle(msg.getData().getString("title"));
    }
}