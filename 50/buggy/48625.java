public void setInterruptPersistence(int persistence) {
    if ((persistence > 0) && (persistence < 16)) {
        writeRegister(nz.geek.android.things.drivers.i2c.Tcs34725.PERS, persistence);
    }
}