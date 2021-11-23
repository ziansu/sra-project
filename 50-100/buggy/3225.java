@java.lang.Override
protected java.lang.Void doInBackground(android.content.Context... contexts) {
    try {
        NetworkUtilsAndReceiver.ONLY_WIFI = android.preference.PreferenceManager.getDefaultSharedPreferences(contexts[0]).getBoolean("only_wifi", false);
        ar.rulosoft.navegadores.Navigator.navigator = new ar.rulosoft.navegadores.Navigator(contexts[0]);
    } catch (java.lang.Exception ignore) {
        ignore.printStackTrace();
    }
    return null;
}