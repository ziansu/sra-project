private void readDataFile() {
    android.content.SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, com.walkap.x_android.MODE_PRIVATE);
    universityName = prefs.getString("university", "");
    facultyName = prefs.getString("faculty", "");
    degreeCourseName = prefs.getString("degreeCourse", "");
    schoolSubjectList = prefs.getStringSet("schoolSubject", null);
    if ((schoolSubjectList) != null) {
        android.util.Log.d("*** readDataFile ***", ((schoolSubjectList.size()) + ""));
    }
}