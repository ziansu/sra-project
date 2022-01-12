public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key.equals("Klassenstufe")) {
        java.lang.String klasseGesamt = getClassName(sharedPreferences);
        sharedPreferences.edit().putString("KlasseGesamt", klasseGesamt).apply();
    }else
        if (key.equals("Klasse")) {
            java.lang.String klasseGesamt = getClassName(sharedPreferences);
            sharedPreferences.edit().putString("KlasseGesamt", klasseGesamt).apply();
        }
    
}