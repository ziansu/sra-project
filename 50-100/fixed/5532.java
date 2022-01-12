@java.lang.Override
public boolean onContextItemSelected(android.view.MenuItem item) {
    android.widget.AdapterView.AdapterContextMenuInfo info = ((android.widget.AdapterView.AdapterContextMenuInfo) (item.getMenuInfo()));
    switch (item.getItemId()) {
        case R.id.edit :
            return true;
        case R.id.delete :
            list.removeItem(keyList[info.position]);
            reload();
            return true;
        default :
            return super.onContextItemSelected(item);
    }
}