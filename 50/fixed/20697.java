@java.lang.Override
public void onClick(android.view.View v) {
    long result = dbHelper.sqlInsert(DbTables.RadioMap.TABLE_NAME, null, getDummy().toDbValues());
    android.widget.Toast.makeText(getContext(), (result + "rows inserted"), Toast.LENGTH_SHORT).show();
}