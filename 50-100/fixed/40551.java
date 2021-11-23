public static void saveUserProgramId(java.lang.Long id_program) {
    android.content.Context context = org.eyeseetea.malariacare.data.database.utils.PreferencesState.getInstance().getContext();
    android.content.SharedPreferences sharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putLong("logged_user_program", id_program);
    editor.commit();
}