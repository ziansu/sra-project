public static synchronized void SetScores(tilitoli.Scores s) {
    if ((tilitoli.NetworkClient.scores) == null) {
        tilitoli.NetworkClient.scores = s;
    }else {
        tilitoli.NetworkClient.scores.MergeScores(s);
    }
}