@java.lang.Override
public void init(example.GameContainer gc, org.newdawn.slick.state.StateBasedGame game) throws example.SlickException {
    this.game = game;
    asteroid = new example.Asteroids(2.0F, 5.0F);
    for (int i = 0; i < (asteroids.length); i++) {
        asteroids[i] = new example.Asteroids(2.0F, i);
    }
    playerObject.init();
    playerObject.input = gc.getInput();
    projectile = new example.Projectile();
    projectile.input = gc.getInput();
}