public void render(org.newdawn.slick.Graphics g) {
    super.render(g);
    if (isDraggable) {
        draggableBounds.setLocation(getX(), getY());
        g.setColor(org.xodia.usai2d.Dialog.DEFAULT_BAR);
        g.fill(draggableBounds);
        if (isDragged) {
            g.setColor(org.xodia.usai2d.Dialog.DEFAULT_DRAG);
            g.draw(draggedBounds);
        }
    }
}