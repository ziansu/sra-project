private void setToKorKeyboard() {
    if ((keyboardTypeFlag) != (KOR)) {
        android.content.SharedPreferences pref = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
        android.content.SharedPreferences.Editor prefEdit = pref.edit();
        prefEdit.putString("prefLanguage", "1");
        prefEdit.commit();
        keyboardTypeFlag = KOR;
        setAutomata(keyboardTypeFlag, stateAutomata);
    }
}