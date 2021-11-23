public static boolean updateStudent(student.Student theStudent, java.lang.String theColumn, java.lang.Object theData) {
    if ((student.StudentCollection.mStudentDB) == null) {
        student.StudentCollection.mStudentDB = new data.StudentDB();
    }
    java.lang.String message = student.StudentCollection.mStudentDB.updateStudent(theStudent, theColumn, theData);
    return !(message.startsWith("Error updating student: "));
}