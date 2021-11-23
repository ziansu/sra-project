@java.lang.Override
public boolean onCreateActionMode(android.view.ActionMode mode, android.view.Menu menu) {
    mMode = mode;
    getMenuInflater().inflate(R.menu.select_all, menu);
    mode.setTitle("已選擇:0");
    android.util.Log.i("zj", "onCreateActionMode");
    return true;
}