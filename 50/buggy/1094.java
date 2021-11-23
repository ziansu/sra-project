@java.lang.Override
public void init(org.newdawn.slick.GameContainer container) throws org.newdawn.slick.SlickException {
    eManager.addEntity(new net.mrfornal.lts.Car(new org.newdawn.slick.geom.Vector2f(), 0));
    for (net.mrfornal.entity.Entity e : eManager.getAllEntities()) {
        e.init(container);
    }
}