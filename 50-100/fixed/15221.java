@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent toInsertClient = new android.content.Intent(this, rainvagel.healthreporter.ClientClasses.InsertClientActivity.class);
    java.lang.String passedData = ((groupsReversed.get(groupNames.get(position))) + ",") + (groupNames.get(position));
    android.util.Log.v("NewClientActivity", passedData);
    toInsertClient.putExtra("GroupID", passedData);
    startActivity(toInsertClient);
}