@java.lang.Override
protected synchronized void handle(android.os.Message msg) {
    switch (msg.what) {
        case MESSAGE_INPUT :
            handleInput(((java.lang.String) (msg.obj)));
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