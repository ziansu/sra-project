@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String name = ((java.lang.String) (((android.widget.TextView) (view.findViewById(R.id.txtHeader))).getText()));
    edu.ccbcmd.pathwayguide.CourseClass newCourse = loader.getCourseByName(name);
    runRest(newCourse, newCourse.getPosition());
}