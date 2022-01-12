@java.lang.Override
public void update(org.newdawn.slick.GameContainer container, int delta) throws org.newdawn.slick.SlickException {
    synchronized(objects) {
        for (game_object.GameObject object : objects.values()) {
            object.update(container, delta);
        }
    }
}