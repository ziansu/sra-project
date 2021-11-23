private void write(int ireg, byte[] data) {
    if (this.isArmed())
        this.i2cDeviceClient.write(ireg, data, false);
    
}