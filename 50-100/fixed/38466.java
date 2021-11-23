private static synchronized void removePropertiesFromSharedPrefs() {
    if ((com.indicative.client.java.android.Indicative.getInstance().context) == null) {
        android.util.Log.v("Indicative", "Indicative instance has not been initialized; not adding common prop");
        return ;
    }
    android.content.SharedPreferences prefs = com.indicative.client.java.android.Indicative.getInstance().context.getSharedPreferences(com.indicative.client.java.android.Indicative.PROPS_PREFS, Context.MODE_PRIVATE);
    prefs.edit().clear().commit();
}