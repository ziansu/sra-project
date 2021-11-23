@java.lang.Override
public void componentResized(java.awt.event.ComponentEvent e) {
    int newWidth = this.getWidth();
    if (newWidth != (oldComponentWidth)) {
        double move = 0.0;
        int amount = newWidth - (oldComponentWidth);
        if (zoomedOutBeyondOneToOne) {
            move = -(amount * (zoom));
        }else {
            move = -(((double) (amount)) / ((double) (zoom)));
        }
        move /= 2.0;
        oldComponentWidth = newWidth;
        moveGraphPosition(move);
    }
}