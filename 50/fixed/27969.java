private void write8(int ireg, byte data) {
    this.i2cDeviceClient.write8(ireg, data, false);
}