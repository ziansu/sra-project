@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, final android.view.View view, int pos, long id) {
    android.widget.Toast.makeText(this, ((java.lang.Integer.toString(pos)) + " Clicked"), Toast.LENGTH_SHORT).show();
    showEntryEditDialog(((vocabletrainer.heinecke.aron.vocabletrainer.lib.Storage.Entry) (adapter.getItem(pos))), false);
}