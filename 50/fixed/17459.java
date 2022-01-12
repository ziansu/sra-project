@java.lang.Override
public void saveAdminDataToSharedPreferences(java.lang.Boolean isAdmin) {
    android.content.SharedPreferences.Editor editor = getSharedPreferences(Constants.ADMIN, cazimir.com.bancuribune.ui.list.MODE_PRIVATE).edit();
    editor.putBoolean(Constants.ADMIN, isAdmin);
    editor.apply();
}