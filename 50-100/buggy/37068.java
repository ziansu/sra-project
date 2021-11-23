@org.junit.Before
public void setup() {
    winnersSoFar = new java.util.ArrayList<>();
    losersSoFar = new java.util.ArrayList<>();
    com.intuit.wasabi.experimentobjects.Bucket.Label winner = Bucket.Label.valueOf("TestWinner");
    com.intuit.wasabi.experimentobjects.Bucket.Label loser = Bucket.Label.valueOf("TestLoser");
    winnersSoFar.add(winner);
    losersSoFar.add(loser);
    hasSufficientData = true;
    fractionDataCollected = 0.5;
    progress = new com.intuit.wasabi.analyticsobjects.statistics.Progress.Builder().withFractionDataCollected(fractionDataCollected).withSufficientData(hasSufficientData).withWinnersSoFar(winnersSoFar).withLosersSoFar(losersSoFar).build();
}