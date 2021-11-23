public static void setSeen(android.content.Context c, java.lang.String key) {
    c.getSharedPreferences("Kantidroid", Context.MODE_PRIVATE).edit().putBoolean("key", true).commit();
}