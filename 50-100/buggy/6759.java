private void logKeys(java.util.List<org.jfl110.api.auth.rolling.RollingKey> sortedKeys) {
    for (int i = 1; i < (sortedKeys.size()); i++) {
        org.jfl110.api.auth.rolling.RollingKey key = sortedKeys.get(i);
        java.lang.System.out.println(((((((("Key[" + i) + "] ") + (key.keyNumber())) + " ") + (key.validFrom())) + " ") + (key.validForSeconds())));
    }
}