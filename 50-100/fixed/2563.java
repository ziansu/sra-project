public static void loadUniversitymain() {
    try {
        com.csvreader.CsvReader file;
        file = new com.csvreader.CsvReader("src/Data/TestDataUniversityName.csv");
        test.Main.universityDM = new test.UniversityDM(file);
        test.Main.university = test.Main.universityDM.getUniversity();
        java.lang.String studentsfilelocation = "src/Data/STU.DUMP.csv";
        java.lang.String studentcoursesfilelocation = "src/Data/STC.DUMP.csv";
        test.Main.universityDM.importStudentCourses(studentcoursesfilelocation);
        test.Main.universityDM.importStudents(studentsfilelocation);
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}