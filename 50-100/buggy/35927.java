private static void appendTrace(java.lang.String methodCallMessage, java.lang.CharSequence deviceBits) {
    if (deviceBits == null) {
        deviceBits = "";
    }
    FourBitTwoDisclosureDeviceUnlocker.traceLog.append(methodCallMessage);
    FourBitTwoDisclosureDeviceUnlocker.traceLog.append(" (");
    for (int i = 0; i < (deviceBits.length()); i++) {
        FourBitTwoDisclosureDeviceUnlocker.traceLog.append(deviceBits.charAt(i));
    }
    FourBitTwoDisclosureDeviceUnlocker.traceLog.append(")\n");
}