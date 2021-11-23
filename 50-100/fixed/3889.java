public void setX(float x) {
    float offset = (rectangle.getX()) - x;
    for (game.ui.levelselect.LevelItem item : items) {
        item.setX(((item.getX()) - offset));
    }
    rectangle.setX(((rectangle.getX()) - offset));
}