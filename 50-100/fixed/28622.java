public void mbSendXY(android.view.View v) {
    if (!(mMicroBitPairingService.isConnected()))
        mMicroBitPairingService.connect();
    
    android.widget.SeekBar xAngle = ((android.widget.SeekBar) (findViewById(R.id.xServoAngle)));
    android.widget.SeekBar yAngle = ((android.widget.SeekBar) (findViewById(R.id.yServoAngle)));
    int x = xAngle.getProgress();
    int y = yAngle.getProgress();
    mMicroBitPairingService.writeXY(x, y);
}