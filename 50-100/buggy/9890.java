public boolean isViewUnder(android.view.View view, int x, int y) {
    if (view == null) {
        return false;
    }
    return (((x >= (view.getX())) && (x < ((view.getX()) + (view.getWidth())))) && (y >= (view.getY()))) && (y < ((view.getBottom()) + (view.getHeight())));
}