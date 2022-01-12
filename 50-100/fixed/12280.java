@java.lang.Override
public void onClick(android.view.View v) {
    com.example.android.groceries2.MainActivity.dbHelper.deleteListTable(listVersion);
    android.content.Intent intent = new android.content.Intent(this, com.example.android.groceries2.MainActivity.class);
    intent.putExtra("tab", 2);
    startActivity(intent);
    android.widget.Toast.makeText(this, (listName + " deleted"), Toast.LENGTH_SHORT).show();
}