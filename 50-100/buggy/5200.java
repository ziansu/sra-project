@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    prefs.setLastCourseSelected(position);
    es.ugr.swad.swadroid.model.Course courseSelected = ((es.ugr.swad.swadroid.model.Course) (listCourses.get(position)));
    courseCode = courseSelected.getId();
    es.ugr.swad.swadroid.Global.setSelectedCourseCode(courseCode);
    es.ugr.swad.swadroid.Global.setSelectedCourseShortName(courseSelected.getShortName());
    es.ugr.swad.swadroid.Global.setSelectedCourseFullName(courseSelected.getFullName());
    createMenu();
}