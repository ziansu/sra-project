public int getContentType() {
    byte b = 0;
    if ((softDeviceSize) > 0)
        b |= no.nordicsemi.android.dfu.DfuBaseService.TYPE_SOFT_DEVICE;
    
    if ((bootloaderSize) > 0)
        b |= no.nordicsemi.android.dfu.DfuBaseService.TYPE_BOOTLOADER;
    
    if ((applicationSize) > 0)
        b |= no.nordicsemi.android.dfu.DfuBaseService.TYPE_APPLICATION;
    
    if (((((applicationSize) == 0) && ((softDeviceSize) == 0)) && ((bootloaderSize) == 0)) && ((softDeviceAndBootloaderBytes) != null))
        b = (no.nordicsemi.android.dfu.DfuBaseService.TYPE_SOFT_DEVICE) | (no.nordicsemi.android.dfu.DfuBaseService.TYPE_BOOTLOADER);
    
    return b;
}