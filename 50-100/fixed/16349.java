public java.lang.String toString() {
    java.lang.StringBuffer buf = new java.lang.StringBuffer();
    for (java.lang.String kwdStr : m_kwdSet.keySet()) {
        buf.append(((get(kwdStr)) + "\n"));
    }
    return buf.toString();
}