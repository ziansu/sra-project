public java.lang.String toString() {
    java.lang.String s = "";
    int[] packet = xbm.getFrameData();
    for (int i = 0; i < (packet.length); i++) {
        s = jmri.util.StringUtil.appendTwoHexFromInt(packet[i], s);
    }
    return s;
}