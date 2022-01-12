public void onReceive(android.content.Context context, android.content.Intent intent) {
    int type = intent.getIntExtra(Common.BROADCAST_TYPE, (-1));
    if (type == (Common.BROADCAST_INFO)) {
        java.lang.String info = intent.getStringExtra(Common.BROADCAST_VALUE);
        isPowerOn = intent.getBooleanExtra(Common.BROADCAST_VALUE_STATE, false);
        tvInfo.setText(info);
    }else
        if (type == (Common.BROADCAST_STOP))
            onClickPower(null);
        
    
}