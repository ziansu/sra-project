public void onClick(android.content.DialogInterface dialog, int id) {
    int pos = listView.getCheckedItemPosition();
    if (pos != (getCurrentLanguagePosition())) {
        com.arnastofnun.idordabanki.LocaleSettings localeSettings = new com.arnastofnun.idordabanki.LocaleSettings(context);
        localeSettings.setLanguage(com.arnastofnun.idordabanki.Settings.getLanguageFromPos(pos), com.arnastofnun.idordabanki.activities.SplashActivity.class, true);
    }
}