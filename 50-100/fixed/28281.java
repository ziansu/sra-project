private java.lang.String getDataBytes(jmri.jmrix.nce.NceMessage m, int start, int number) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder(" ");
    for (int i = start; i < (start + number); i++) {
        sb.append(jmri.util.StringUtil.twoHexFromInt(m.getElement(i))).append(" ");
    }
    return sb.toString();
}