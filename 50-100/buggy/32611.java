public void sendJoyState() {
    for (int i = 0; i < 2; i++) {
        if ((mProtoVersion) == 1) {
            mNet.sendState(mJoyControl, mJoyState);
        }else {
            byte[] data = new byte[]{ mProtoHeader.version , mProtoHeader.joyControl , mProtoHeader.joyState1 , mProtoHeader.joyState2 };
            mNet.sendState2(data);
        }
    }
}