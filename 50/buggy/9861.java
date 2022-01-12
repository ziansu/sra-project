@java.lang.Override
public info.martinmarinov.drivers.usb.DvbTuner create(info.martinmarinov.drivers.usb.rtl28xx.Rtl28xxDvbDevice.Rtl28xxI2cAdapter adapter, info.martinmarinov.drivers.usb.DvbFrontend.I2GateControl i2GateControl, android.content.res.Resources resources) throws info.martinmarinov.drivers.DvbException {
    return new info.martinmarinov.drivers.usb.rtl28xx.R820tTuner(26, 2, adapter, RafaelChip.CHIP_R820T, info.martinmarinov.drivers.usb.rtl28xx.Rtl28xxTunerType.RTL2832_R820T.xtal, i2GateControl, resources);
}