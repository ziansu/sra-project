public void setup() {
    Spaceship player0 = new Spaceship(this, 'w', 's', 'a', 'd', 250, 250, 0, 30, ' ', 0);
    Spaceship player1 = new Spaceship(this, 'w', 's', 'a', 'd', 250, 248, 0, 32, ' ', 1);
    Game.gameObjects.add(player0);
    Game.gameObjects.add(player1);
}