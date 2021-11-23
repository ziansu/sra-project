public static void SetScores(tilitoli.Scores s) {
    synchronized(tilitoli.NetworkClient.scores) {
        tilitoli.NetworkClient.scores.MergeScores(s);
    }
}