@java.lang.Override
public java.util.UUID async_send(short peripheralId, short cmdId, short[] data) {
    checkPeripheralId(peripheralId);
    checkCmdId(cmdId);
    checkData(data);
    return dispatchCall("0", new java.lang.Object[]{ peripheralId , cmdId , getRequestHwProfile() , data }, getDefaultWaitingTimeout());
}