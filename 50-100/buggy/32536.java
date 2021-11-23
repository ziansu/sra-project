@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int pos, long id) {
    android.util.Log.d("***********", calendarList.get(pos).getId());
    editor = sharedpreferences.edit();
    editor.putString(PREF_CAL_ID, calendarList.get(pos).getId());
    editor.commit();
    getData();
}