@java.lang.Override
public void init(org.newdawn.slick.GameContainer container, org.newdawn.slick.state.StateBasedGame game) throws org.newdawn.slick.SlickException {
    currentMap = new fi.ringofsnake.entities.SnakeMap(3000, 3);
    player = new fi.ringofsnake.entities.Player(container);
    gamePlayMusic = fi.ringofsnake.io.ResourceManager.fetchMusic("GAMEPLAY_BG_MUSIC");
    scrollingBackGround = new fi.ringofsnake.entities.ScrollingBackGround(0.5F);
    squirrels = new fi.ringofsnake.entities.SquirrelMob();
}