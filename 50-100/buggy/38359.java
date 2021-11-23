@java.lang.Override
public void componentResized(java.awt.event.ComponentEvent e) {
    double move = 0.0;
    int newWidth = this.getWidth();
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