@java.lang.Override
public void running(int count) throws java.io.IOException {
    if (count == 1) {
        Checker(_activity.getReceiveEvent());
    }else {
        makeOTP();
        _activity.receive.getByte();
        _activity.send.setPacket(_OTP.getBytes(), 1024).write();
    }
}