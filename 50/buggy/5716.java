private void saveUserFilter() {
    android.content.SharedPreferences preferences = getActivity().getPreferences(Activity.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = preferences.edit();
    settings.writeToPreferences(editor);
    editor.apply();
}