@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    if (id == (R.id.action_settings)) {
        getFragmentManager().beginTransaction().replace(R.id.fListContainer, new com.codepath.todoapp.fragments.TodoPrefFragment(), "pref").addToBackStack("pref").commit();
    }
    return true;
}