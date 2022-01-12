private double getCategoryScore(java.lang.String category) {
    double score;
    int count;
    ScoreIterator itr = new ScoreIterator(listOfScores);
    while (itr.hasNext()) {
        Score temp;
        temp = itr.next();
        if (temp.getCategory().equals(category)) {
            score += temp.getPercent();
            count++;
        }
    } 
    return score / count;
}