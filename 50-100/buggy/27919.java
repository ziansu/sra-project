@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.util.Log.d("LoadProjectActivity", "clicked");
    android.database.Cursor curs = ((android.database.Cursor) (parent.getItemAtPosition(position)));
    java.lang.String projObjDir = "project_obj_" + (curs.getString(curs.getColumnIndexOrThrow(ProjectDBHelper.PROJ_TABLE.COLS.ID)));
    dbk.debook.models.ScanProject sp = loadProject(projObjDir);
    android.content.Intent editIntent = new android.content.Intent(this, dbk.debook.activities.ScanActivity.class);
    editIntent.putExtra("ScanProject", sp);
    startActivity(editIntent);
}