@java.lang.Override
public void handle(javafx.scene.input.MouseEvent arg0) {
    root.setBackground(new javafx.scene.layout.Background(GRASSY_GROUND));
    refreshSelect();
    currentPlayer = ((currentPlayer) + 1) % (players.size());
    refreshPlayers();
    updateInfo();
}