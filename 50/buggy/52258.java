@java.lang.Override
public void mousePressed(java.awt.event.MouseEvent e) {
    com.northvine.engineering.Main.startGame(highCardGame, cardTable);
    com.northvine.engineering.Main.initEventHandlers(highCardGame, cardTable);
}