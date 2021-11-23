private void removeUserFilter() {
    android.content.SharedPreferences.Editor editor = getPreferences().edit();
    tech.niemandkun.domain.FilterSettings.deleteFromPreferences(editor);
    editor.apply();
}