@java.lang.Override
public void quit() {
    java.lang.String winner = myController.getWinner();
    if (!("".equals(winner))) {
        de.htwg.se.moerakikemu.view.viewimpl.TextUI.LOGGER.info((("Der Gewinner ist " + winner) + "!!!\n"));
    }else {
        de.htwg.se.moerakikemu.view.viewimpl.TextUI.LOGGER.info("Unentschieden");
    }
}