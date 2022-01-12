public void run() {
    if (!(betsEqual()))
        simulateTurns();
    else {
        android.util.Log.w("GAME_DEBUG", "Bets Equal");
        (currentRound)++;
        switch (currentRound) {
            case 1 :
                draw();
                break;
            case 2 :
                river();
                break;
            case 3 :
                continueGame();
                break;
            case 4 :
                break;
        }
    }
}