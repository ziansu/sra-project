public void onClick(android.view.View v) {
    mBluetoothConnection = new com.example.andrea.starship_battle.Bluetooth.BluetoothConnectionService(this);
    android.util.Log.d(com.example.andrea.starship_battle.Activities.StartGameActivity.TAG, "startBTConnection: Initializing RFCOM Bluetooth Connection.");
    android.util.Log.d(com.example.andrea.starship_battle.Activities.StartGameActivity.TAG, ("Trying to pair with " + (avversarioDevice.getName())));
    mBluetoothConnection.startClient(avversarioDevice, com.example.andrea.starship_battle.Activities.StartGameActivity.MY_UUID_INSECURE);
    turno = true;
}