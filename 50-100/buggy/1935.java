private void switchTimers(int nextPlayer) {
    if ((!(gameOverFlag)) && (!((players[1]) instanceof com.example.systemadministrator.myapplication.AIPlayer))) {
        if (nextPlayer == 0) {
            players[1].stopTimer();
            players[0].startTimer(p1Status, false);
        }else {
            players[0].stopTimer();
            players[1].startTimer(p2Status, false);
        }
    }
}