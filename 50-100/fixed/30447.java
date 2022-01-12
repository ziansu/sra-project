@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    input_course = ((java.lang.String) (parent.getItemAtPosition(position).toString()));
    if ((input_course) != "My Course(s)") {
        inputVerified = true;
        inputCourse = input_course.split(" ", 2);
    }
}