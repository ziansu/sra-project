public void IncrementCurrentScore(int currentHole) {
    if (!(gameStarted)) {
        return ;
    }
    if ((currentHole >= 1) && (currentHole <= 18)) {
        if ((score[(currentHole - 1)]) <= (com.manleysoftware.michael.discgolfapp.Model.Player.maxScoreAllowable)) {
            return ;
        }
        (score[(currentHole - 1)])++;
    }
}