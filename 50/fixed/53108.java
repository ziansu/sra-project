@java.lang.Override
public void initStatesList(org.newdawn.slick.GameContainer arg0) throws org.newdawn.slick.SlickException {
    this.addState(new game.MainMenu());
    this.addState(new game.MainGame());
}