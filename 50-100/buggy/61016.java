public java.lang.String generate(java.lang.String UserID, java.lang.String Prefix) {
    now = new java.util.Date();
    int hc = now.hashCode();
    java.lang.String hhc = java.lang.Integer.toHexString(hc);
    java.lang.String ff = (UserID + Prefix) + hhc;
    return ff;
}