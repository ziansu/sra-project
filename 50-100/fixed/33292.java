@java.lang.Override
public void handleMessage(android.os.Message msg) {
    switch (msg.what) {
        case IDevice.REQUEST_CONNECT :
            requestConnect();
            break;
        case IDevice.REQUEST_DISCONNECT :
            requestDisconnect();
            break;
        case IDevice.REQUEST_WRITE :
            requestWrite(((byte[]) (msg.obj)));
            break;
    }
}