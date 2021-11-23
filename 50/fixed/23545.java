public void remove(java.lang.String fileName) {
    android.content.SharedPreferences.Editor editor;
    editor = sharedPreferences.edit();
    editor.remove(fileName);
    editor.commit();
}