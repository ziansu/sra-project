public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    dbHandler.loeschenMain(("" + (((android.widget.TextView) (view)).getText())));
    adapter.clear();
    java.util.ArrayList<java.lang.String> resultsUpdate = dbHandler.loeschenAusgabe();
    adapter.notifyDataSetChanged();
}