@java.lang.Override
public boolean onContextItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (com.example.maks.database.activities.MainActivity.CM_DELETE_ID)) {
        android.widget.AdapterView.AdapterContextMenuInfo acmi = ((android.widget.AdapterView.AdapterContextMenuInfo) (item.getMenuInfo()));
        dbUtils.deleteUser(myAdapter.getItemId(acmi.position));
        listView.setAdapter(new com.example.maks.database.adapters.MyAdapter(this, com.example.maks.database.App.getInstance().getDb()));
        myAdapter.notifyDataSetChanged();
        return true;
    }
    return super.onContextItemSelected(item);
}