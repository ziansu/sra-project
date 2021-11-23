private static java.util.ArrayList<java.util.List<model.course.LessonGroup>> initMainArr(java.util.List<model.course.Course> lcourse) {
    java.util.ArrayList<java.util.List<model.course.LessonGroup>> $ = new java.util.ArrayList<>();
    for (model.course.Course ¢ : lcourse) {
        $.add(¢.getLectures());
        $.add(¢.getTutorials());
    }
    return $;
}