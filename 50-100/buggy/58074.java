@java.lang.Override
public boolean onContextItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.deleteContextItem)) {
        toBeDeleted = adapter.getItem(info.position);
        realm.beginTransaction();
        toBeDeleted.deleteFromRealm();
        realm.commitTransaction();
        adapter.remove(toBeDeleted);
        adapter.notifyDataSetChanged();
    }
    return true;
}