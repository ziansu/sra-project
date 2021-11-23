@java.lang.Override
protected synchronized void handle(android.os.Message msg) {
    switch (msg.what) {
        case MESSAGE_INPUT :
            byte[] info = ((byte[]) (msg.obj));
            java.lang.String message = new java.lang.String(info);
            handleInput(message);
            break;
        case MESSAGE_TOAST :
            l(new java.lang.String(((byte[]) (msg.obj))));
            break;
        case MESSAGE_CONNECTED :
            toast("CONNECTED!");
            break;
        case MESSAGE_DISCONNECTED :
            toast("Device Disconnected!");
            break;
    }
}