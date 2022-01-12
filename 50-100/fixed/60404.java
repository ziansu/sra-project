@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.widget.CheckBox checkBox = ((android.widget.CheckBox) (view.findViewById(R.id.checkbox1)));
    adapter.setItem((position - 1), (!(checkBox.isChecked())));
    checkBox.toggle();
    android.util.Log.v(uk.co.paulcowie.cinnotify.settings.AllowedAppsActivity.TAG, ((("Set item at position " + position) + " to ") + (checkBox.isChecked())));
}