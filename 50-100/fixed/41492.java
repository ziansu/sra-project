private boolean winner() {
    if (board.checkGame()) {
        winner = board.calculateWinner();
        switch (winner) {
            case 0 :
                changeDescription(4);
                break;
            case 1 :
                players.increaseWins(1);
                displayWinner();
                return true;
            case 2 :
                players.increaseWins(2);
                displayWinner();
                return true;
        }
        repaint();
    }
    return false;
}