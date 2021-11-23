@java.lang.Override
protected boolean setFreq(int sampleRate) throws info.plux.pluxapi.bitalino.bth.BITalinoException {
    info.plux.pluxapi.CommandArguments commandArguments = new info.plux.pluxapi.CommandArguments();
    commandArguments.setSampleRate(validateSampleRate(1000));
    byte[] command = BITalino.SET_FREQ.getCommand(commandArguments).command;
    try {
        mConnectedThread.write(command);
    } catch (java.lang.Exception e) {
        throw new info.plux.pluxapi.bitalino.bth.BITalinoException(BITalinoErrorTypes.BT_DEVICE_NOT_CONNECTED);
    }
    return true;
}