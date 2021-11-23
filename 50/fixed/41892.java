@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    github.johnnysc.testappintech.MainActivity.positionOfItem = position;
    android.content.Intent intent = new android.content.Intent(this, github.johnnysc.testappintech.PlayerActivity.class);
    startActivityForResult(intent, 0);
}