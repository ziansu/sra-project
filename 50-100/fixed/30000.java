@java.lang.Override
public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    if ((msg.what) > 1) {
        connectPeriod();
    }else
        if ((msg.what) == 1) {
            connectPeriod();
            timer.cancel();
            btn_conn.setText("CONNECT");
            btn_conn.setEnabled(true);
        }
    
}