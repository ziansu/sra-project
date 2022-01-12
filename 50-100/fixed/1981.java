public void remove(java.lang.Object o) {
    if (o instanceof com.github.fishio.IDrawable) {
        drawables.remove(o);
    }
    if (o instanceof com.github.fishio.IMovable) {
        movables.remove(o);
    }
    if (o instanceof com.github.fishio.Entity) {
        entities.remove(o);
    }
    if (o instanceof com.github.fishio.ICollidable) {
        collidables.remove(o);
    }
}