private void sendMessage(java.lang.String message) {
    if (((battleService) == null) || ((battleService.getState()) != (BluetoothBattleService.STATE_CONNECTED))) {
        android.widget.Toast.makeText(this, R.string.not_connected, Toast.LENGTH_SHORT).show();
        return ;
    }
    if ((message.length()) > 0) {
        byte[] send = message.getBytes();
        battleService.write(send);
    }
}