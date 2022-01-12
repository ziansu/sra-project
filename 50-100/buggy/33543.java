public void onClick(android.view.View view) {
    int languageID = language_radios.getCheckedRadioButtonId();
    java.lang.String langSelected = null;
    switch (languageID) {
        case R.id.english_button :
            langSelected = "en_US";
            break;
        case R.id.french_button :
            langSelected = "fr";
            break;
    }
    com.example.nspace.museedesondes.Model.Preferences.setLocale(langSelected);
    com.example.nspace.museedesondes.Model.Preferences.savePreferences(langSelected);
    android.content.Intent startLauncher = new android.content.Intent(this, com.example.nspace.museedesondes.MainActivity.class);
    startActivity(startLauncher);
}