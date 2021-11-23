@java.lang.Override
public void handleMessage(byte[] message) {
    if ((message[0]) == (OPERATION_COMPLETE)) {
        com.bobs.serialcommands.QueryCordWrap.LOGGER.info("Cordwrap on");
        mount.setCordWrapEnabled(true);
    }else {
        com.bobs.serialcommands.QueryCordWrap.LOGGER.error("Cordwrap not enabled.");
    }
}