public void saveToLastPoem(at.alextornoreanu.thegesichtgedicht.model.Poem poem) {
    android.content.SharedPreferences sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(mContext);
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    editor.putString(at.alextornoreanu.thegesichtgedicht.services.SavedDataService.POEM_TITLE, poem.getTitle());
    editor.putString(at.alextornoreanu.thegesichtgedicht.services.SavedDataService.POEM_AUTHOR, poem.getAuthor());
    editor.putString(at.alextornoreanu.thegesichtgedicht.services.SavedDataService.POEM_TEXT, poem.getText());
    editor.apply();
}