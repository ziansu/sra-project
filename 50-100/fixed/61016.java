public java.lang.String generate(java.lang.String Prefix, java.lang.String UserID) {
    now = new java.util.Date();
    int hc = now.hashCode();
    java.lang.String hhc = java.lang.Integer.toHexString(hc);
    java.lang.String ff = (Prefix + UserID) + hhc;
    return ff;
}