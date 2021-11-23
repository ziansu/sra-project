@java.lang.Override
public void onConnectionError(java.lang.Throwable throwable) {
    textView2.setText("Connection error");
    throwable.printStackTrace();
}