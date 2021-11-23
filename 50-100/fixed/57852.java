@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case com.marianhello.bgloc.LocationService.MSG_REGISTER_CLIENT :
            mClients.put(msg.arg1, msg.replyTo);
            break;
        case com.marianhello.bgloc.LocationService.MSG_UNREGISTER_CLIENT :
            mClients.remove(msg.arg1);
            break;
        case com.marianhello.bgloc.LocationService.MSG_SWITCH_MODE :
            switchMode(msg.arg1);
            break;
        default :
            super.handleMessage(msg);
    }
}