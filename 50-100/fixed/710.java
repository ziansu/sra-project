@java.lang.Override
public void init() {
    super.init();
    if (!(getParent().has(sk.entity.component.AABB.class)))
        getParent().add(0, new sk.entity.component.AABB(((2.0F * (width)) / (sk.game.Window.getWidth())), ((2.0F * (height)) / (sk.game.Window.getHeight())), transform));
    
}