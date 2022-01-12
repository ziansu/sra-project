private java.util.Collection<models.Score> findBestScoresByVIPPlayers() {
    if ((scores) == null) {
        return new java.util.ArrayList<models.Score>();
    }
    java.util.List<models.Score> scores = Score.finder.where().conjunction().add(com.avaje.ebean.Expr.eq("game", this)).orderBy("value desc").findList();
    return keepBestScoreByVIPPlayer(scores);
}