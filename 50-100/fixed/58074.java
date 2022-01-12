@java.lang.Override
public boolean onContextItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.deleteContextItem)) {
        toBeDeleted = adapter.getItem(info.position);
        adapter.remove(toBeDeleted);
        adapter.notifyDataSetChanged();
        realm.beginTransaction();
        toBeDeleted.deleteFromRealm();
        realm.commitTransaction();
    }
    return true;
}