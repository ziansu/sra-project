private static boolean isEmptyState(java.lang.String sqlState) {
    if (sqlState == null)
        return true;
    
    int len = sqlState.length();
    int idx = 0;
    for (idx = 0; (idx < len) && ((sqlState.charAt(idx)) == ' '); ++idx);
    return idx == len;
}