public static void removeAll() {
    com.xgheaven.litecourseschedule.Course course;
    for (int i = 0; i < (com.xgheaven.litecourseschedule.Course.courses.size()); i++) {
        course = com.xgheaven.litecourseschedule.Course.courses.get(i);
        if (!(course.isDivide())) {
            com.xgheaven.litecourseschedule.Course.courses.remove(i);
            i--;
        }
    }
}