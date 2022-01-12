@java.lang.Override
public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    if ((msg.what) > 0) {
        connectPeriod();
    }else {
        timer.cancel();
        btn_conn.setText("CONNECT");
        btn_conn.setEnabled(true);
    }
}