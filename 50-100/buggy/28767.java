@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, final android.view.View view, int position, long id) {
    int pos = position + 1;
    android.widget.Toast.makeText(this, ((java.lang.Integer.toString(pos)) + " Clicked"), Toast.LENGTH_SHORT).show();
    showEntryEditDialog(((vocabletrainer.heinecke.aron.vocabletrainer.lib.Storage.Entry) (adapter.getItem(pos))), false);
}