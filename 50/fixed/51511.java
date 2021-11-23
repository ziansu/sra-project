private void write(int ireg, byte[] data) {
    this.i2cDeviceClient.write(ireg, data, false);
}