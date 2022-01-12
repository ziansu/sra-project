@java.lang.Override
public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    java.lang.String text = ((java.lang.String) (msg.obj));
    textView.setText(((text + "\n") + (textView.getText())));
}