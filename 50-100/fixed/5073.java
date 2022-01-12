private static java.lang.String safePassword(java.lang.String unsafe) {
    java.lang.String safe = unsafe;
    int nn = safe.length();
    for (int i = nn - 1; i < 15; i++) {
        safe = safe + "*";
    }
    return safe;
}