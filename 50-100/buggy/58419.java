@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.content.SharedPreferences.Editor edit = pref.edit();
    edit.putInt("plength", java.lang.Integer.parseInt(tamanhos[which]));
    edit.commit();
    MainActivity.length = java.lang.Integer.parseInt(tamanhos[which]);
    customListViewValuesArr.get(0).setSubtitle(tamanhos[which]);
    adapter = new com.rpfsoftwares.rollapass.PreferencesAdapter(customListView, customListViewValuesArr, res);
    list.setAdapter(adapter);
}