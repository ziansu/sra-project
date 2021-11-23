public static boolean isLedgerWithScreen(final android.hardware.usb.UsbDevice d) {
    final int pId = d.getProductId();
    final boolean screenDevice = (pId == (com.btchip.comm.android.BTChipTransportAndroid.PID_NANOS)) || (pId == (com.btchip.comm.android.BTChipTransportAndroid.PID_BLUE));
    return screenDevice && ((d.getVendorId()) == (com.btchip.comm.android.BTChipTransportAndroid.VID2));
}