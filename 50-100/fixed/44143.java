@java.lang.Override
public void init() {
    cursor = new com.kambius.darkrange.game.Animation("res/images/cursor.png", 1, true);
    cursor.start();
    cursor.addFragments(0, 0, 32, 32, 7, 1);
    map = new com.kambius.darkrange.game.GameMap("res/maps/testMap.mp");
    player = new com.kambius.darkrange.game.Player(map);
    usersInterface = new com.kambius.darkrange.game.UsersInterface.UsersInterface();
    sound = new com.kambius.darkrange.game.Sound("res/sounds/isaac.wav", true);
}