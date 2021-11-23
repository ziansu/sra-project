public double getAvarageGrade() {
    double avarageGrade = 0.0;
    if ((exams) != null) {
        double allGrades = 0.0;
        double numberOfGrades = 0.0;
        for (ch.grademasters.model.Exam exam : exams) {
            if (exam.isCount()) {
                allGrades = allGrades + (exam.getGrade());
                numberOfGrades++;
            }
        }
        if (numberOfGrades != 0) {
            avarageGrade = allGrades / numberOfGrades;
        }
    }
    return avarageGrade;
}