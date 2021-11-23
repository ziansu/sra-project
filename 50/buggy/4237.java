@java.lang.Override
public void render(org.newdawn.slick.GameContainer cont, org.newdawn.slick.Graphics g) throws org.newdawn.slick.SlickException {
    field.render(g);
    robot.render(cont, g);
}