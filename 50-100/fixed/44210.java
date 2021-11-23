private static boolean isBanglaAvailable() {
    java.util.Locale[] locales = java.util.Locale.getAvailableLocales();
    for (java.util.Locale locale : locales) {
        if (locale.getDisplayName().toLowerCase().contains("bengali")) {
            return true;
        }
    }
    return false;
}