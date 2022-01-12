@java.lang.Override
byte[] getEncodedStatementName() {
    if ((batchedEncodedName) == null) {
        java.lang.String n = super.getStatementName();
        if (n != null) {
            batchedEncodedName = org.postgresql.core.Utils.encodeUTF8(n);
        }
    }
    return batchedEncodedName;
}