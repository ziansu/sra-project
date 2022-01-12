public java.lang.Double getAvarageGrade() {
    double avarageGrade = 0;
    if ((exams) != null) {
        double allGrades = 0;
        double numberOfGrades = 0;
        for (ch.grademasters.model.Exam exam : exams) {
            if (exam.isCount()) {
                allGrades = allGrades + (exam.getGrade());
                numberOfGrades++;
            }
        }
        avarageGrade = allGrades / numberOfGrades;
    }
    return avarageGrade;
}