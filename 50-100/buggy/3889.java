public void setX(float x) {
    float offset = (x > (rectangle.getX())) ? x - (rectangle.getX()) : (rectangle.getX()) - x;
    for (game.ui.levelselect.LevelItem item : items) {
        item.setX(((item.getX()) + offset));
    }
    rectangle.setX(((rectangle.getX()) + offset));
}