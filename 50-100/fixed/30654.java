@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case RETURN_DATA_AND_CODE :
            returnDataAndCode(msg.replyTo);
            break;
        case RETURN_RESULTS :
            emitSocketWithID(com.phonemap.phonemap.services.SOCKET_RETURN, com.phonemap.phonemap.utils.Utils.bundleToJSON(msg.getData()));
            break;
        case FAILED_EXECUTING_CODE :
            emitSocketWithID(com.phonemap.phonemap.services.SOCKET_FAILED_EXECUTING, com.phonemap.phonemap.utils.Utils.bundleToJSON(msg.getData()));
            break;
        default :
            super.handleMessage(msg);
    }
}