public void setGlobalPosition(engine.math.Vector2i position) {
    if ((parent) == null) {
        this.position = position;
        return ;
    }
    this.position = position.sub(parent.getGlobalPosition()).rotateBy((-(parent.getRotation())));
}