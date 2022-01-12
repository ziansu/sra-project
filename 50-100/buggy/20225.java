public synchronized com.zhiquanyeo.skynet.network.protocol.DS_ProtocolBase.DS_Joystick getJoystick(int joystickNum) {
    if ((d_lastPacket) != null) {
        java.util.ArrayList<com.zhiquanyeo.skynet.network.protocol.DS_ProtocolBase.DS_Joystick> joysticks = d_lastPacket.joysticks;
        if ((joystickNum < 0) || (joystickNum >= (joysticks.size()))) {
            return null;
        }
        return joysticks.get(joystickNum);
    }
    return null;
}