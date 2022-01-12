public java.lang.String studentLookup(int studentID) {
    java.lang.String output = new java.lang.String();
    int studentIndex = getStudentIndex(studentList, studentID);
    if (studentIndex < 0) {
        output = "The student you are looking for is not in the directory.";
    }else {
        output = ((("The student you are looking for is " + (studentList[studentIndex].name)) + ", with Student ID # [") + (studentList[studentIndex].studentID)) + "] .\n";
    }
    return output;
}