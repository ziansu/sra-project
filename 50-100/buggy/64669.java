public static void createAsteroids(int amount) {
    MenuChooseDifficulty.easyClicked = false;
    MenuChooseDifficulty.mediumClicked = false;
    MenuChooseDifficulty.hardClicked = false;
    java.lang.System.out.println(amount);
    java.util.Random r = new java.util.Random();
    for (int i = 0; i < amount; i++) {
        game.Game.handler.addObject(new game.Asteroid(new game.Point(r.nextInt(game.Game.WIDTH), r.nextInt(game.Game.HEIGHT)), ID.Asteroid, 30, 30));
    }
}