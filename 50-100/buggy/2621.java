public void run() {
    if (!(betsEqual()))
        simulateTurns();
    else {
        android.util.Log.w("GAME_DEBUG", "Bets Equal");
        (currentRound)++;
        switch (currentRound) {
            case 1 :
                deal();
                break;
            case 2 :
                draw();
                break;
            case 3 :
                river();
                break;
            case 4 :
                continueGame();
                break;
        }
    }
}