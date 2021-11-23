@java.lang.Override
public void handle(javafx.scene.input.MouseEvent arg0) {
    root.setBackground(new javafx.scene.layout.Background(GRASSY_GROUND));
    refreshSelect();
    do {
        currentPlayer = ((currentPlayer) + 1) % (players.size());
    } while ((players.get(currentPlayer)) == null );
    refreshPlayers();
    updateInfo();
}