private java.lang.String join(java.lang.String[] idComponents) {
    if ((idComponents.length) == 0) {
        return "";
    }
    java.lang.StringBuilder sb = new java.lang.StringBuilder(idComponents[0]);
    for (int i = 1; i < (idComponents.length); i++) {
        sb.append(":").append(idComponents[i]);
    }
    return sb.toString();
}