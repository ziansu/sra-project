public java.lang.String toString() {
    java.lang.StringBuffer buf = new java.lang.StringBuffer();
    for (java.lang.String key : m_charPosKwds.keySet()) {
        buf.append(key);
        java.util.HashSet<allen.address.basic.Kwd> kwdSet = m_charPosKwds.get(key);
        for (allen.address.basic.Kwd kwd : kwdSet) {
            buf.append((" " + (kwd.str())));
        }
        buf.append("\n");
    }
    return buf.toString();
}