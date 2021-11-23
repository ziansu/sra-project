public static double getScoreFromTime(java.util.Collection<de.vanhck.data.Score> scores, java.util.Date from) {
    double endScore = 0;
    double endCourse = 0;
    for (de.vanhck.data.Score score : scores) {
        if (((score.getDate()) != null) && (score.getDate().after(from))) {
            endCourse += score.getCourse();
            endScore += score.getScore();
        }
    }
    return endCourse == 0 ? 0 : endScore / endCourse;
}