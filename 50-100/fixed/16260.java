public void setLatencyTimer(short timer) throws com.ftdi.FTD2XXException, java.lang.IllegalArgumentException {
    if (!((timer >= 1) && (timer < 255))) {
        throw new java.lang.IllegalArgumentException("Valid range is 2 – 255!");
    }
    com.ftdi.FTDevice.ensureFTStatus(com.ftdi.FTDevice.ftd2xx.FT_SetLatencyTimer(ftHandle, ((byte) (timer))));
}