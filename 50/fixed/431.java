public static boolean isAppearanceExternalFile(java.lang.String appearance) {
    if ((appearance != null) && (appearance.toLowerCase().trim().contains("search("))) {
        return true;
    }else {
        return false;
    }
}