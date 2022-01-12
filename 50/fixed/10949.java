private net.sourceforge.usbdm.constants.UsbdmSharedConstants.InterfaceType getInterfaceType() {
    int deviceIndex = comboInterfaceType.getSelectionIndex();
    if (deviceIndex < 0) {
        deviceIndex = 0;
    }
    return interfaceTypes[deviceIndex];
}