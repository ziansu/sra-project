private static void loadCourses(org.springframework.context.ApplicationContext ctx) {
    base.course.CourseRepository cr = ((base.course.CourseRepository) (ctx.getBean("courseRepository")));
    if ((cr.findByName("CPE123")) == null) {
        base.CatalogParser cp = base.CatalogParser.getInstance();
        java.util.ArrayList<java.lang.String> departments = cp.getDepartments();
        for (java.lang.String department : departments) {
            java.util.ArrayList<base.course.Course> courses = cp.getCourses(department);
            cr.save(courses);
        }
    }
}