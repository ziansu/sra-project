private void sendMessage(java.lang.String message, java.util.ArrayList<android.bluetooth.BluetoothDevice> mDevices) {
    if ((message != null) && ((message.length()) > 0)) {
        mChatService.sendMessage(message, mDevices);
        mOutStringBuffer.setLength(0);
        mOutEditText.setText(mOutStringBuffer);
    }
}