public static int selectGradeType() {
    int courseElement = GradeTrackerDriver.selectCourse();
    int policySize = GradeTrackerDriver.registeredCourses.get(courseElement).getGradingPolicy().size();
    if (policySize == 0) {
        return -1;
    }
    int gradeTypeElement = policySize;
    GradeTrackerDriver.displayGradePolicy();
    gradeTypeElement = Utility.getInt(("Please Type the number " + "of the course you would like to select. "), 1, policySize);
    return gradeTypeElement - 1;
}