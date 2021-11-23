public com.badlogic.poker.core.logic.WinCondition checkCombination() {
    com.badlogic.poker.core.logic.Card[] cardsOnDesk = game.getTable(java.lang.Thread.currentThread().getStackTrace()[2].getMethodName()).getCardsOnDesk();
    java.lang.System.out.println(("cards on table: " + (cardsOnDesk.length)));
    com.badlogic.poker.core.logic.WinCondition win = checkForKind(cardsOnDesk);
    game.drawTable();
    game.changeMoney(win.getCost());
    return win;
}