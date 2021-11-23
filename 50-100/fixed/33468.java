@java.lang.Override
public boolean onContextItemSelected(android.view.MenuItem menuItem) {
    android.widget.AdapterView.AdapterContextMenuInfo info = ((android.widget.AdapterView.AdapterContextMenuInfo) (menuItem.getMenuInfo()));
    if ((menuItem.getItemId()) == 1) {
        delete(info.position);
    }else {
        org.json.JSONObject json = new at.ac.univie.jakobhirschl.contintcollector.db.DBHandler(this).getJSON(idList.get(info.position));
        shareSingleJSON(json, idList.get(info.position));
    }
    return true;
}