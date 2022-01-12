private int setControlCommand(int request, int value, int index, byte[] data) {
    int dataLength = (data == null) ? 0 : data.length;
    int response = connection.controlTransfer(com.felhr.usbserial.FTDISerialDevice.FTDI_REQTYPE_HOST2DEVICE, request, value, (((mInterface.getId()) + 1) + index), data, dataLength, com.felhr.usbserial.USB_TIMEOUT);
    android.util.Log.i(com.felhr.usbserial.FTDISerialDevice.CLASS_ID, ("Control Transfer Response: " + (java.lang.String.valueOf(response))));
    return response;
}