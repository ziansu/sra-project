@java.lang.Override
public void init() {
    if (getParent().has(sk.gfx.Transform.class))
        transform = getParent().get(sk.gfx.Transform.class);
    
    if (!(getParent().has(sk.entity.component.AABB.class)))
        getParent().add(0, new sk.entity.component.AABB(((2.0F * (width)) / (sk.game.Window.getWidth())), ((2.0F * (height)) / (sk.game.Window.getHeight())), transform));
    
}