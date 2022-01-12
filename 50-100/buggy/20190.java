@java.lang.Override
public void init() {
    currentLevel = loader.loadLevel(INITIAL_LEVEL);
    currentRoom = currentLevel.getRoom(1, room);
    prince = new entities.MPPrince(200, 240, loader, 3, "right", player1);
    enemy = new entities.MPEnemy(460, 260, loader, 3, "left", "red", player2, prince);
    currentRoom.addCharacter(prince);
    currentRoom.addCharacter(enemy);
    over = false;
    paused = false;
    texts = new java.util.ArrayList<data.Text>();
}