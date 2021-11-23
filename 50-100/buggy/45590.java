@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    sb.append(getSMain());
    params.iterator();
    for (java.util.Iterator<java.lang.String> iter = params.iterator(); iter.hasNext();) {
        java.lang.String value = ((java.lang.String) (iter.next()));
        sb.append(SCSMsg.MSG_SEPARATOR).append(value);
    }
    return sb.toString();
}