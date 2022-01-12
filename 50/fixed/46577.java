@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = io.github.gdg_bucharest.gdg_feedly_client.EntryActivity.newIntent(this, streamContents.getItems(), position);
    startActivity(intent);
}