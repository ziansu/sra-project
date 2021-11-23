public void setLuxometerPeriod(int period) {
    byte[] periodBytes = new byte[]{ java.nio.ByteBuffer.allocate(4).putInt(period).array()[3] };
    org.eclipse.kura.bluetooth.le.BluetoothLeGattCharacteristic optoPeriodChar;
    try {
        if (isCC2650()) {
            optoPeriodChar = this.gattServices.get(org.eclipse.kura.internal.driver.ble.sensortag.TiSensorTag.OPTO).findCharacteristic(TiSensorTagGatt.UUID_OPTO_SENSOR_PERIOD);
            optoPeriodChar.writeValue(periodBytes);
        }
    } catch (org.eclipse.kura.KuraException e) {
        org.eclipse.kura.internal.driver.ble.sensortag.TiSensorTag.logger.error("Gyroscope period set failed", e);
    }
}