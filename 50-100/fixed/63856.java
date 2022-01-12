public void run() {
    if (stopTimers) {
        t.cancel();
    }else {
        if ((board.getPacman().getLives()) < 1) {
            frame.remove(board);
            stopGameFunctionality();
            frame.add(new infdpacman.view.EndGame(hScores, infdpacman.Game.player.getScore(), gameWon), java.awt.BorderLayout.CENTER);
            frame.validate();
            t.cancel();
            t.purge();
        }
    }
}