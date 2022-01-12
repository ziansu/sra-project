@java.lang.Override
public void mouseMoved(java.awt.event.MouseEvent e) {
    java.lang.System.out.println(("MOUSE at " + (e.getPoint())));
    utils.Event event = new utils.Event(utils.Event.MOUSEMOVE, e.getX(), e.getY(), Cfg.frame_width, Cfg.frame_height);
    try {
        postman.send(event);
    } catch (java.io.IOException e1) {
        java.lang.System.err.println(("Fail to send Event " + event));
    }
}