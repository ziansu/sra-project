@java.lang.Override
public void onClick(android.view.View v) {
    android.content.SharedPreferences sharedpreferences = getSharedPreferences(Constants.SHARED_PREF_NAME, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
    editor.clear();
    editor.commit();
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_MAIN);
    intent.addCategory(Intent.CATEGORY_HOME);
    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
    startActivity(intent);
}