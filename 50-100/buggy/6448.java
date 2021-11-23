public void setup() {
    Spaceship player0 = new Spaceship(this, 250, 250, 0, 30, 'w', 's', 'a', 'd', ' ', 0);
    Spaceship player1 = new Spaceship(this, 250, 248, 0, 32, 'w', 's', 'a', 'd', ' ', 1);
    Game.gameObjects.add(player0);
    Game.gameObjects.add(player1);
}