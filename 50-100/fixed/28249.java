@java.lang.Override
public void update(org.newdawn.slick.GameContainer container, int delta) throws org.newdawn.slick.SlickException {
    if (((target) != null) && ((!(target.isAttacking())) || (!(target.isAlive())))) {
        target = null;
    }
}