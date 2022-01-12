@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.database.Cursor wordData = cr.query(DBURI, null, null, null, null);
    android.content.Intent i = new android.content.Intent(android.content.Intent.ACTION_VIEW);
    wordData.moveToPosition(position);
    android.net.Uri u = android.net.Uri.parse(wordData.getString(2));
    i.setData(u);
    startActivity(i);
    wordData.close();
}