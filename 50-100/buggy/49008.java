@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.parse.ParseObject item = group.get(position);
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.group9.choresplitter.GroupsListActivity.class).putExtra("GroupID", item.getString("GroupID")).putExtra("GroupName", item.getString("GroupName"));
    startActivity(intent);
    finish();
}