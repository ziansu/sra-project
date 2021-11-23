@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    int itemPosition = position;
    java.lang.String itemValue = ((java.lang.String) (list.getItemAtPosition(position)));
    android.widget.Toast.makeText(getApplicationContext(), ((("Position :" + itemPosition) + "  ListItem : ") + itemValue), Toast.LENGTH_LONG).show();
    updateUserAnswerObject((itemValue + ".dat"));
    android.content.Intent intent = new android.content.Intent(this, com.mylayouts.jm.cityofgosnellsdiybusinesssecurity.ChecklistActivity.class);
    startActivity(intent);
}