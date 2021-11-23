private static void appendTrace(final java.lang.String methodCallMessage, final java.lang.CharSequence deviceBits) {
    if (deviceBits != null) {
        FourBitTwoDisclosureDeviceUnlocker.traceLog.append(methodCallMessage);
        FourBitTwoDisclosureDeviceUnlocker.traceLog.append(" (");
        for (int i = 0; i < (deviceBits.length()); i++) {
            FourBitTwoDisclosureDeviceUnlocker.traceLog.append(deviceBits.charAt(i));
        }
        FourBitTwoDisclosureDeviceUnlocker.traceLog.append(")\n");
    }
}