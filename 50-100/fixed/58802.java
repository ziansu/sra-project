public java.lang.String createKey(java.lang.String p, java.lang.String ns, java.lang.String local) {
    java.lang.StringBuffer builder = new java.lang.StringBuffer();
    java.lang.String jns = getJSONNamespace(ns);
    if ((jns != null) && ((jns.length()) != 0)) {
        builder.append(jns).append('.');
    }
    return builder.append(local).toString();
}