@java.lang.Override
public void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
    int ctrlMod = (java.awt.event.MouseWheelEvent.CTRL_MASK) | (java.awt.event.MouseWheelEvent.CTRL_DOWN_MASK);
    int modifier = e.getModifiers();
    boolean ctrlDown = (modifier & ctrlMod) != 0;
    if (ctrlDown) {
        int sign = e.getWheelRotation();
        if (sign < 0) {
            this.cam_zoom_increase();
            return ;
        }
        if (sign > 0) {
            this.cam_zoom_decrease();
            return ;
        }
    }
}