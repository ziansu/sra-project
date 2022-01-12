@java.lang.Override
public void onDataReceived(android.bluetooth.BluetoothDevice device, byte[] data) {
    final com.adamnickle.deck.Message message = com.adamnickle.deck.Message.fromBytes(data);
    if ((message != null) && (message.isValid())) {
        this.onMessageReceived(message);
    }
}