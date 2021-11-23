private void generateBomb() {
    for (int i = 0; i < 15; i++) {
        int d = random.nextInt(1500);
        int f = random.nextInt(500);
        entities.add(new com.mygdx.game.States.Bomb((750 + d), ((Gdx.graphics.getHeight()) + f), this));
    }
}