private void processEvent(java.awt.event.MouseEvent e) {
    if (e instanceof java.awt.event.MouseWheelEvent) {
        main.Render.zoom(((((java.awt.event.MouseWheelEvent) (e)).getWheelRotation()) * (-1)), e.getPoint());
    }
}