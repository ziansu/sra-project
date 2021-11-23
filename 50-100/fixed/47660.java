public static void main(java.lang.String[] args) {
    FactoryBuildingForm MakeCourse = new FactoryBuildingForm();
    Course ood = MakeCourse.createCourse("Self-Pace", "Object-Oriented-Design", 0.0, "GW", "CS", "1-10-17", "5-21-17");
    java.lang.System.out.println(ood.getName());
    java.lang.System.out.println(ood.getType());
    Course calculus = MakeCourse.createCourse("Semester", "Calculus-I", 4000.0, "GW", "Math", "Spring 2017", 90.0, 3.0, "Junior Calc", "Calc");
    java.lang.System.out.println(calculus.getName());
}