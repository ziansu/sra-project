@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (com.shiftscope.utils.constants.SessionConstants.VOLUME_FROM_USER) {
        float volValue = progress / 100.0F;
        com.shiftscope.utils.Operation operation = new com.shiftscope.utils.Operation();
        operation.setUserId(SessionConstants.USER_ID);
        operation.setTo(SessionConstants.DEVICE_ID);
        operation.setOperationType(RequestTypes.SET_VOLUME);
        operation.setValue(volValue);
        com.shiftscope.netservices.TCPService.send(operation);
    }
}