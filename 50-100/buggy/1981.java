public void add(java.lang.Object o) {
    if (o instanceof com.github.fishio.IDrawable) {
        drawables.add(((com.github.fishio.IDrawable) (o)));
    }
    if (o instanceof com.github.fishio.IMovable) {
        movables.add(((com.github.fishio.IMovable) (o)));
    }
    if (o instanceof com.github.fishio.Entity) {
        entities.add(((com.github.fishio.Entity) (o)));
    }
    if (o instanceof com.github.fishio.ICollidable) {
        collidables.add(((com.github.fishio.ICollidable) (o)));
    }
}