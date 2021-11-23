@java.lang.Override
public void mouseWheelMoved(java.awt.event.MouseWheelEvent e) {
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