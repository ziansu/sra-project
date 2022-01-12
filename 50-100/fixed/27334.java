@java.lang.Override
public void init(info.martinmarinov.drivers.usb.DvbTuner tuner) throws info.martinmarinov.drivers.DvbException {
    this.tuner = tuner;
    writeReg(2, 5, 0);
    writeReg(2, 11, 0);
    writeReg(2, 12, 0);
    loadFirmware(R.raw.mn8847202fw);
    writeReg(2, 8, 29);
    writeReg(0, 217, 227);
}