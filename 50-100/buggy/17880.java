private int get() {
    android.content.SharedPreferences sPref = ru.chernysh.plasmatorchsetup.App.getInstance().getSharedPreferences(null, Context.MODE_PRIVATE);
    java.lang.String savedText = sPref.getString(requestTag, "");
    android.util.Log.d(ru.chernysh.plasmatorchsetup.StoredKey.LOG_TAG, (((("Value " + savedText) + " is loaded from ") + (requestTag)) + " field in shared preferences"));
    if ((savedText.length()) <= 0)
        return 0;
    
    return new java.lang.Integer(savedText);
}