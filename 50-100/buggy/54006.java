public java.lang.Double getAvarageGrade() {
    double avarageGrade = 0;
    if ((subjects) != null) {
        double allGrades = 0;
        double numberOfGrades = 0;
        for (ch.grademasters.model.Subject subject : subjects) {
            allGrades = allGrades + (subject.getAvarageGrade());
            numberOfGrades++;
        }
        avarageGrade = allGrades / numberOfGrades;
    }
    return avarageGrade;
}