@java.lang.Override
public void handleMessage(android.os.Message msg) {
    super.handleMessage(msg);
    if ((msg.what) == 0) {
        mTcpClient.setHearBeatCountDownTimer(new android.os.CountDownTimer(java.lang.Long.MAX_VALUE, 20000) {
            @java.lang.Override
            public void onTick(long l) {
                android.util.Log.i("logmsg", "excited::2::tick");
                if ((mTcpClient) != null)
                    mTcpClient.sendMessage("{\"M\":\"checkin\",\"ID\":\"1442\",\"K\":\"20b14bbaf\"}\n");
                
            }

            @java.lang.Override
            public void onFinish() {
                android.util.Log.i("logmsg", "excited::2::tick finish");
            }
        });
    }
}