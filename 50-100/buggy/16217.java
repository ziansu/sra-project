@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.database.Cursor cursor = ((android.database.Cursor) (adapter.getItem(position)));
    java.lang.String course_name = cursor.getString(cursor.getColumnIndex(CourseCalendarInfo.FeedEntry.COLUMN_COURSE_NAME));
    currentClass = course_name;
    android.util.Log.d("dropdwnHandler", ("Current course_name is " + (currentClass)));
    updateChildFragments(course_name);
}