private void switchTimers(int nextPlayer) {
    if (!(gameOverFlag)) {
        if (nextPlayer == 0) {
            if (!((players[1]) instanceof com.example.systemadministrator.myapplication.AIPlayer))
                players[1].stopTimer();
            
            players[0].startTimer(p1Status, false);
        }else {
            players[0].stopTimer();
            if (!((players[1]) instanceof com.example.systemadministrator.myapplication.AIPlayer))
                players[1].startTimer(p2Status, false);
            
        }
    }
}