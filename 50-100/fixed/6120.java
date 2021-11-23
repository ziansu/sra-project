@java.lang.Override
public boolean isValid(java.lang.CharSequence charSequence) {
    java.util.regex.Matcher m = com.muqdd.iuob2.features.schedule_builder.ScheduleBuilderFragment.pCourse.matcher(charSequence.toString().toUpperCase().trim());
    if (!(m.find())) {
        return false;
    }
    java.lang.String courseName = m.group(1);
    return (java.util.Arrays.binarySearch(Constants.coursesNameList, courseName)) > 0;
}