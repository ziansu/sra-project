public double getAvarageGrade() {
    double avarageGrade = 0.0;
    if ((subjects) != null) {
        double allGrades = 0.0;
        double numberOfGrades = 0.0;
        for (ch.grademasters.model.Subject subject : subjects) {
            allGrades = allGrades + (subject.getAvarageGrade());
            numberOfGrades++;
        }
        if (numberOfGrades != 0) {
            avarageGrade = allGrades / numberOfGrades;
        }
    }
    return avarageGrade;
}