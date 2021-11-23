private void write8(int ireg, byte data) {
    if (this.isArmed())
        this.i2cDeviceClient.write8(ireg, data, false);
    
}