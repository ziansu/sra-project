public static int getVersion(android.content.Context context, int defaultVersion) {
    android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(io.gresse.hugo.anecdote.storage.SpStorage.SP_KEY, Context.MODE_PRIVATE);
    return sharedPreferences.getInt(io.gresse.hugo.anecdote.storage.SpStorage.SP_KEY_VERSION, 0);
}