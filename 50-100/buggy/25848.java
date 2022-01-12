@java.lang.Override
public void uiNewValueForCharacteristic(android.bluetooth.BluetoothGatt gatt, android.bluetooth.BluetoothDevice device, android.bluetooth.BluetoothGattService service, android.bluetooth.BluetoothGattCharacteristic ch, final java.lang.String strValue) {
    org.esec.mcg.utils.logger.LogUtils.d("read characteristic callback");
    mContext.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            characteristicItemBean.setCharacteristicValue(strValue);
            characteristicValueText.setVisibility(View.VISIBLE);
            characteristicValue.setVisibility(View.VISIBLE);
            characteristicValue.setText(strValue);
        }
    });
}