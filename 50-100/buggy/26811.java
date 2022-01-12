private static boolean isEmptyState(java.lang.String sqlState) {
    int len = sqlState.length();
    int idx = 0;
    for (idx = 0; (idx < len) && ((sqlState.charAt(idx)) == ' '); ++idx);
    return idx == len;
}