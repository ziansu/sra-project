protected boolean isSysfsGpioExported(java.lang.String gpioNum) {
    boolean exported = false;
    final java.lang.String gpioPath = ((org.eclipse.kura.linux.net.modem.ModemDriver.GPIO_PATH) + "/gpio") + (org.eclipse.kura.linux.net.modem.ModemDriver.RELIAGATE_10_05_GSM_RESET_GPIO_NUM);
    java.io.File fgpioFolder = new java.io.File(gpioPath);
    if (fgpioFolder.exists()) {
        exported = true;
    }
    return exported;
}