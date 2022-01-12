public float getTrueX() {
    com.badlogic.gdx.scenes.scene2d.Actor temp = this;
    float coordX = super.getX();
    while ((temp.getParent()) != null) {
        coordX += temp.getParent().getX();
        temp = temp.getParent();
    } 
    return coordX;
}