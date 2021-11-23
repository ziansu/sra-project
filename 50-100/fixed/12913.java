private void executeOnStartActions() {
    int actionIndexOnStart = java.lang.Integer.parseInt(sharedPrefs.getString(getString(R.string.key_prefActionOnStart), java.lang.Integer.toString(ActionOnStartRandomAyah)));
    if (actionIndexOnStart == (ActionOnStartNone)) {
        return ;
    }else
        if (actionIndexOnStart == (ActionOnStartSurahList)) {
            android.content.Intent intent = new android.content.Intent(this, com.frrahat.quransimple.SuraListActivity.class);
            startActivityForResult(intent, REQUEST_SURAH_LIST);
        }else
            if (actionIndexOnStart == (ActionOnStartRandomAyah)) {
                showARandomAyah = true;
            }
        
    
}