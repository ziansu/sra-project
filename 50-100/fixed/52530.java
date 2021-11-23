public void mapPressed(int x, int y) {
    switch (map.drawMode()) {
        case PENCIL :
            map.setTile(x, y, fruitEditor.getSelectedTile());
            break;
        case RECTANGLE :
            break;
        case CIRCLE :
            break;
        case FILL :
            floodFill(x, y, map.getTile(x, y), fruitEditor.getSelectedTile());
        default :
            break;
    }
    update();
}