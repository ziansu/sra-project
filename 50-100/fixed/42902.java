@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String value = input.getText().toString();
    if ((value.length()) > 0) {
        android.content.SharedPreferences settings = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor = settings.edit();
        editor.putString("Group", value);
        editor.commit();
        d.dismiss();
        refreshChoresCall();
    }
}