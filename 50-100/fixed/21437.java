public java.lang.Double getAverageScore() {
    updateStudentMap();
    java.lang.Double sum = 0.0;
    java.lang.Double numScores = 0.0;
    for (java.lang.Integer i : scores.keySet()) {
        sum += getGrade(i).getNumericalValue();
        if (!(getGrade(i).excused())) {
            numScores++;
        }
    }
    return sum / numScores;
}