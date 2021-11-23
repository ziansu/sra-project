private java.lang.String getDataBytes(jmri.jmrix.nce.NceMessage m, int start, int number) {
    java.lang.StringBuffer sb = new java.lang.StringBuffer(" ");
    for (int i = start; i < (start + number); i++) {
        sb.append(((jmri.util.StringUtil.twoHexFromInt(m.getElement(i))) + " "));
    }
    return sb.toString();
}