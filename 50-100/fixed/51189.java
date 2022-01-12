private slash.navigation.tcx.TrainingCenterDatabaseT createTrainingCenterDatabase(slash.navigation.gpx.GpxRoute route, int startIndex, int endIndex) {
    slash.navigation.tcx.ObjectFactory objectFactory = new slash.navigation.tcx.ObjectFactory();
    slash.navigation.tcx.TrainingCenterDatabaseT trainingCenterDatabaseT = objectFactory.createTrainingCenterDatabaseT();
    slash.navigation.tcx.CourseListT courseListT = objectFactory.createCourseListT();
    trainingCenterDatabaseT.setCourses(courseListT);
    java.util.List<slash.navigation.tcx.CourseT> courses = courseListT.getCourse();
    courses.add(createCourse(route, route.getName(), startIndex, endIndex));
    return trainingCenterDatabaseT;
}