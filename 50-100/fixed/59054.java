@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    semester = ((ch.bbcag.blugij.grademanager.sqlite.model.Semester) (parent.getItemAtPosition(position)));
    fachSpinner.setAdapter(new ch.bbcag.blugij.grademanager.adapter.FachAdapter(getApplicationContext(), R.layout.custom_list_view_item_one_column, databaseHelper.getAllFachsBySemester(semester.getId()), true));
}