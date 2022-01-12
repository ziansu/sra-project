public void saveToLastPoem(at.alextornoreanu.thegesichtgedicht.model.Poem poem) {
    android.content.SharedPreferences sharedPref = android.preference.PreferenceManager.getDefaultSharedPreferences(mContext);
    android.content.SharedPreferences.Editor editor = sharedPref.edit();
    editor.putString(poem.getTitle(), at.alextornoreanu.thegesichtgedicht.services.SavedDataService.POEM_TITLE);
    editor.putString(poem.getAuthor(), at.alextornoreanu.thegesichtgedicht.services.SavedDataService.POEM_AUTHOR);
    editor.putString(poem.getText(), at.alextornoreanu.thegesichtgedicht.services.SavedDataService.POEM_TEXT);
    editor.apply();
}