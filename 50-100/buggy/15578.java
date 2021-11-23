public void onClick(android.view.View v) {
    mBluetoothConnection = new com.example.andrea.starship_battle.Bluetooth.BluetoothConnectionService();
    android.util.Log.d(com.example.andrea.starship_battle.Activities.StartGameActivity.TAG, "startBTConnection: Initializing RFCOM Bluetooth Connection.");
    android.util.Log.d(com.example.andrea.starship_battle.Activities.StartGameActivity.TAG, ("Trying to pair with " + (avversarioDevice.getName())));
    mBluetoothConnection.startClient(avversarioDevice, com.example.andrea.starship_battle.Activities.StartGameActivity.MY_UUID_INSECURE);
    com.example.andrea.starship_battle.Activities.Toast.makeText(this, R.string.go, Toast.LENGTH_LONG).show();
    turno = true;
}