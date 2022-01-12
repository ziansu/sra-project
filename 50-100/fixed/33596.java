private void populateTopics(java.util.List<com.einsteiny.einsteiny.models.Course> allCourses) {
    getTopic("Arts", com.einsteiny.einsteiny.utils.CoursesUtils.getCoursesForCategory(allCourses, "Arts"), R.id.topic1);
    getTopic("Entrepreneurship", com.einsteiny.einsteiny.utils.CoursesUtils.getCoursesForCategory(allCourses, "Entrepreneurship"), R.id.topic2);
    getTopic("Computing & Science", com.einsteiny.einsteiny.utils.CoursesUtils.getCoursesForCategory(allCourses, "Computing & Science"), R.id.topic3);
}