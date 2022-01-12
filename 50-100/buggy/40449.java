@java.lang.Override
public void onResult(com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult loadPlayerScoreResult) {
    java.lang.Long currScore = loadPlayerScoreResult.getScore().getRawScore();
    java.lang.Long score = currScore + newScore;
    android.util.Log.d(datx021512.chalmers.se.greenme.fragments.TravelFragment.TAG, score.toString());
    Games.Leaderboards.submitScore(mainActivity.getmGoogleApiClient(), mainActivity.getResources().getString(R.string.Leaderboard_Transport), score);
}