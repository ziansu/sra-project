private java.lang.String join(java.lang.String[] idComponents) {
    if ((idComponents.length) == 0) {
        return "";
    }
    java.lang.StringBuilder sb = new java.lang.StringBuilder(idComponents[0]);
    for (java.lang.String c : idComponents) {
        sb.append(":").append(c);
    }
    return sb.toString();
}