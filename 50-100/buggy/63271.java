public static jmri.jmrix.lenz.XNetMessage getZ21TurnoutInfoRequestMessage(int address) {
    jmri.jmrix.lenz.XNetMessage msg = new jmri.jmrix.lenz.XNetMessage(4);
    msg.setElement(0, Z21Constants.LAN_X_GET_TURNOUT_INFO);
    msg.setElement(1, ((address & 65280) >> 8));
    msg.setElement(2, (address & 255));
    msg.setParity();
    return msg;
}