public void onReceive(android.content.Context context, android.content.Intent intent) {
    int type = intent.getIntExtra(Common.BROADCAST_TYPE, (-1));
    if (type == (Common.BROADCAST_INFO)) {
        isPowerOn = intent.getBooleanExtra(Common.BROADCAST_VALUE_STATE, false);
        tvInfo.setText(intent.getStringExtra(Common.BROADCAST_VALUE));
    }else
        if (type == (Common.BROADCAST_STOP))
            onClickPower(null);
        
    
}