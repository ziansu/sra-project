public models.Score getLastScore() {
    java.util.List<models.Score> scores = new java.util.ArrayList<models.Score>(this.scores);
    java.util.Collections.sort(scores, new java.util.Comparator<models.Score>() {
        @java.lang.Override
        public int compare(models.Score o1, models.Score o2) {
            return o2.getUpdatedAt().compareTo(o1.getUpdatedAt());
        }
    });
    return scores.get(0);
}