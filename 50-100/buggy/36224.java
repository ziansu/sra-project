private void edit_sameNameCallback(int result, android.content.Context context, fi.zah.ollpu.materialtempo.FavoritesAdapter adapter, android.content.SharedPreferences sharedPref, java.lang.String newName, java.lang.String valueText) {
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    switch (result) {
        case 1 :
            editPreset(context, adapter, sharedPref, newName, valueText);
        case 2 :
            submitEdit(newName, valueText, editor, adapter);
    }
}