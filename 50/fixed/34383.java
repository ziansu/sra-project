public void checkEdge() {
    if ((getY()) >= 700) {
        ((Game) (getWorld())).removerHeart();
        getWorld().removeObject(this);
    }
}