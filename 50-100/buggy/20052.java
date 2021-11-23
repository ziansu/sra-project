@java.lang.Override
public void onReceive(com.adafruit.bleuart.BluetoothLeUart uart, android.bluetooth.BluetoothGattCharacteristic rx) {
    if (((receiveCounter) % 100) == 0) {
        writeLine(receiveCounter.toString());
        writeLine("\n");
    }
    (receiveCounter)++;
    output().append(rx.getStringValue(0));
    android.util.Log.d("RECEIVE", (((rx.getStringValue(0)) + " #UART ") + (uart.toString())));
}