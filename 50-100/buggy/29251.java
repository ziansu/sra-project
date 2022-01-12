@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_settings :
            android.util.Log.i(com.example.myapplication.MainActivity.TAG, "add a new item: ");
            menu.add("SD");
            android.util.Log.i(com.example.myapplication.MainActivity.TAG, "onOptionsItemSelected: action_settings");
            return true;
        case R.id.action_search :
            android.util.Log.i(com.example.myapplication.MainActivity.TAG, "onOptionsItemSelected: action_search ");
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}