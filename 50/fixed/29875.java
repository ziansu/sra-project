@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int pos, long id) {
    showEntryDeleteDialog(((vocabletrainer.heinecke.aron.vocabletrainer.lib.Storage.Entry) (adapter.getItem(pos))), pos);
    return true;
}