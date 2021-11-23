private int getStudentIndex(SortedDirectory.Student[] studentList, int num) {
    for (int i = 0; i < (studentList.length); i++) {
        if ((studentList[i].studentID) == num) {
            return i;
        }
    }
    return -1;
}