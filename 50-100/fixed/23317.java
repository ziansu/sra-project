@java.lang.Override
protected com.smartdevicelink.proxy.RPCMessage createMessage() {
    hapticRect = new com.smartdevicelink.proxy.rpc.HapticRect();
    hapticRect.setId(Test.GENERAL_INTEGER);
    hapticRect.setRect(Test.GENERAL_RECTANGLE);
    hapticArray = new java.util.ArrayList<com.smartdevicelink.proxy.rpc.HapticRect>();
    hapticArray.add(0, hapticRect);
    com.smartdevicelink.proxy.rpc.SendHapticData msg = new com.smartdevicelink.proxy.rpc.SendHapticData();
    msg.setHapticRectData(hapticArray);
    return msg;
}