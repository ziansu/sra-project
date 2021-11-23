private int calculateUidFrom(java.lang.String alias) {
    int uid;
    try {
        uid = java.lang.Integer.parseInt(alias);
    } catch (java.lang.NumberFormatException ex) {
        uid = alias.hashCode();
    }
    return uid;
}