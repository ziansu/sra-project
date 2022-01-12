public void show(android.app.FragmentManager manager, int bestScore, int score, fast.kopach.math.games.ReplayDialog.ReplayListener listener) {
    super.show(manager, "");
    this.listener = listener;
    this.score = score;
    this.bestScore = bestScore;
    if (mInterstitialAd.isLoaded()) {
        mInterstitialAd.show();
    }
}