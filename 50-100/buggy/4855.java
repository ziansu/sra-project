private void sendHPSyncMessage(java.lang.String message) {
    kaist.game.battlecar.service.BluetoothService btService = kaist.game.battlecar.service.BluetoothService.getInstance(this);
    if ((btService.getState()) != (kaist.game.battlecar.service.BluetoothService.STATE_CONNECTED)) {
        android.widget.Toast.makeText(this, R.string.not_connected, Toast.LENGTH_SHORT).show();
        return ;
    }
    if ((message.length()) > 0) {
        byte[] send = message.getBytes();
        btService.write(send);
    }
}