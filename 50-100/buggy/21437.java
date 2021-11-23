public java.lang.Double getAverageScore() {
    updateStudentMap();
    java.lang.Double sum = 0.0;
    java.lang.Double numScores = 0.0;
    for (gradebookproject.Student s : scores.keySet()) {
        sum += getGrade(s).getNumericalValue();
        if (!(getGrade(s).excused())) {
            numScores++;
        }
    }
    return sum / numScores;
}