public void show(android.app.FragmentManager manager, int bestScore, int score, fast.kopach.math.games.ReplayDialog.ReplayListener listener) {
    super.show(manager, "");
    this.listener = listener;
    this.score = score;
    progress1.setMax(fast.kopach.math.Calculation.getScoreBoundaryPoint(bestScore));
    progress1.setProgress(bestScore);
    this.bestScore = bestScore;
    if (mInterstitialAd.isLoaded()) {
        mInterstitialAd.show();
    }
}