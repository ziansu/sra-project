@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println("Start");
    initPokerButtons();
    poker.ui.Board.startNewGame(table);
    initCard();
    if (!(countGame)) {
        cashValue.setPlayerCash(1000);
    }
    initCash();
    initPot();
    start.setEnabled(false);
    deal.setEnabled(true);
    change.setEnabled(true);
    initHandName();
    countGame = true;
}