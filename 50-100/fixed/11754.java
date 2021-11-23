private static boolean isCyclic(int numberOfCourse, java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> prerequisitePerCourse) {
    for (int course = 0; course < numberOfCourse; course++) {
        java.util.Set<java.lang.Integer> targetCourses = new java.util.HashSet<>();
        targetCourses.add(course);
        if (com.sevendragons.practice.leetcode.medium.coursesschedule.Solution.isCourseContainedInPrerequisites(prerequisitePerCourse, targetCourses, course)) {
            return true;
        }
    }
    return false;
}