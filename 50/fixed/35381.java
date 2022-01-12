@java.lang.Override
public boolean isUSBLoaded() {
    if (loadedUSB) {
        java.lang.System.out.println("USB is loaded.");
    }else {
        java.lang.System.out.println("USB is not loaded.");
    }
    return loadedUSB;
}