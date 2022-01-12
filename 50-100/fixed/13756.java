public java.lang.String toCommandlineString() {
    char sep = (neoe.util.FindJDK.isWindows) ? ';' : ':';
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (java.lang.String p1 : sub) {
        if ((sb.length()) > 0) {
            sb.append(sep);
        }
        if (neoe.util.FindJDK.isWindows)
            sb.append('"');
        
        sb.append(p1);
        if (neoe.util.FindJDK.isWindows)
            sb.append('"');
        
    }
    return sb.toString();
}