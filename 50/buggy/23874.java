public boolean scoresHasThisStudent(gradebookproject.Student s) {
    for (gradebookproject.Student stud : scores.keySet()) {
        if ((stud.getIdNumber()) == (s.getIdNumber())) {
            return true;
        }
    }
    return false;
}