public java.lang.String getHTTPHeader() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(n).append("=").append(v).append("; ");
    if ((e) != null) {
        sb.append("expires=").append(e);
    }
    if ((p) != null) {
        sb.append("path=").append(e);
    }
    return sb.toString();
}