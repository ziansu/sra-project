public static double getLastScore(java.util.Collection<de.vanhck.data.Score> scores) {
    double endScore = 0;
    java.util.Date date = new java.util.Date(0);
    for (de.vanhck.data.Score score : scores) {
        if (((score.getDate()) != null) && (score.getDate().after(date))) {
            date = score.getDate();
            endScore = (score.getScore()) / (score.getCourse());
        }
    }
    return endScore;
}