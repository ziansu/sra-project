@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int pos, long id) {
    android.util.Log.d(ru.chernysh.plasmatorchsetup.MainActivity.LOG_TAG, ("Selection in model spinner with pos = " + pos));
    ru.chernysh.plasmatorchsetup.CustomAdapter adapter = ((ru.chernysh.plasmatorchsetup.CustomAdapter) (parent.getAdapter()));
    if (adapter != null) {
        adapter.setSelected(true);
        int selectedKey = adapter.getKey(pos);
    }
}