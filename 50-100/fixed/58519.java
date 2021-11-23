public void onCourseRemoved(com.example.peterchu.watplanner.Models.Course.Course course) {
    java.util.Set<java.lang.String> addedCourses = sharedPreferences.getStringSet(Constants.SHARED_PREFS_ADDED_COURSES, new java.util.HashSet<java.lang.String>());
    addedCourses.remove(java.lang.String.valueOf(course.getId()));
    sharedPreferences.edit().remove(Constants.SHARED_PREFS_ADDED_COURSES).apply();
    sharedPreferences.edit().putStringSet(Constants.SHARED_PREFS_ADDED_COURSES, addedCourses).apply();
    homeFragment.removeCourse(course);
}