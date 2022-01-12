private void winner() {
    if (board.checkGame()) {
        winner = board.calculateWinner();
        switch (winner) {
            case 0 :
                changeDescription(4);
                break;
            case 1 :
                players.increaseWins(1);
                displayWinner();
                break;
            case 2 :
                players.increaseWins(2);
                displayWinner();
                break;
        }
        repaint();
        return ;
    }
}