@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    com.example.balinator.androidprojekt.database.Database db = new com.example.balinator.androidprojekt.database.Database(getApplicationContext());
    db.open();
    db.createService(input1.getText().toString(), input2.getText().toString());
    db.close();
    mAdapter.refreshItems();
    com.example.balinator.androidprojekt.MainActivity.updateMyWidgets(context);
}