public void onClick(android.view.View v) {
    if (isGameOver) {
        android.content.Intent i = new android.content.Intent(this, com.dubstin.btslapjack.StatisticsActivity.class);
        i.putStringArrayListExtra("mySlapTimes", mySlapTimes);
        i.putStringArrayListExtra("connectedDeviceSlapTimes", connectedDeviceSlapTimes);
        startActivity(i);
    }else
        if (!(isGameStarted)) {
            isReadyToStart = true;
            if ((isReadyToStart) && (isConnectedDeviceReadyToStart)) {
                startGame();
            }
            sendBluetoothMessage("start");
            startButton.setText("Waiting for Opponent...");
        }
    
}