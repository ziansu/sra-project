public static java.util.List<okhttp3.Cookie> getOkCookies(com.riyase.realmcookiejar.db.JarEntry jarEntry) {
    if (jarEntry.getCookies().isEmpty()) {
        return new java.util.ArrayList<>();
    }else {
        return com.riyase.realmcookiejar.db.JarEntry.getOkCookies(jarEntry.getCookies());
    }
}