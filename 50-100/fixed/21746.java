private void checkLocaleChange() {
    if (!(com.akexorcist.localizationactivity.LanguageSetting.getLanguage().toLowerCase(java.util.Locale.getDefault()).equals(currentLanguage.toLowerCase(java.util.Locale.getDefault())))) {
        callDummyActivity();
        recreate();
    }
}