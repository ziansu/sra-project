public void deleteStudent(int studentId) {
    for (dataObjects.Student s : studentsList) {
        if ((s.getId()) == studentId) {
            studentsList.remove(s);
        }
    }
}