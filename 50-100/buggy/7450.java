@java.lang.Override
public void setParams(long frequency, long bandwidthHz, @android.support.annotation.NonNull
info.martinmarinov.drivers.DeliverySystem deliverySystem) throws info.martinmarinov.drivers.DvbException {
    enableMaster(true);
    enableSlave(false);
    if (rtl2832Capabilities.getSupportedDeliverySystems().contains(deliverySystem)) {
        activeFrontend = (info.martinmarinov.drivers.usb.rtl28xx.Rtl2832pFrontend.FORCE_ONLY_SLAVE) ? slave : rtl2832Frontend;
    }else {
        enableMaster(false);
        enableSlave(true);
        activeFrontend = slave;
    }
    activeFrontend.setParams(frequency, bandwidthHz, deliverySystem);
}