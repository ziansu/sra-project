public void init(org.newdawn.slick.GameContainer arg0, org.newdawn.slick.state.StateBasedGame arg1) throws org.newdawn.slick.SlickException {
    try {
        myLevel = new game.Level();
    } catch (org.newdawn.slick.SlickException e) {
    }
    bullets = new java.util.LinkedList<game.Bullet>();
    bullets = new java.util.LinkedList<game.Bullet>();
}