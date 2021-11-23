public void remove() {
    android.content.SharedPreferences.Editor editor;
    editor = sharedPreferences.edit();
    editor.remove(com.example.msk.onlinebotique.Utilities.KeyStore.fileName);
    editor.commit();
}