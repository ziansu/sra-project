public static void printStudents(java.util.ArrayList<school.Student> all) {
    java.lang.System.out.printf("Student\tGPA\n");
    java.lang.System.out.printf("-------\t-------\n");
    for (int i = 0; i < (all.size()); i++) {
    }
    for (school.Student s : all) {
        java.lang.System.out.printf("%s\n", s);
    }
    java.lang.System.out.println();
}