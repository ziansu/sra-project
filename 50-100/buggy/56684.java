@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String groupName = ((java.lang.String) (groupList.getItemAtPosition(position)));
    android.content.Intent intent = new android.content.Intent(this, thorleifz.wakeup.InsideGroup.class);
    intent.putExtra("groupName", groupName);
    startActivity(intent);
}