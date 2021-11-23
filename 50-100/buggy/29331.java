@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent arg0) {
    int x = arg0.getX();
    int y = arg0.getY();
    currentComposer.setEnd(new java.awt.Point(x, y));
    currentComposer.complete(x, y);
    try {
        currentComposer = currentComposer.getClass().newInstance();
    } catch (java.lang.InstantiationException e) {
        e.printStackTrace();
    } catch (java.lang.IllegalAccessException e) {
        e.printStackTrace();
    }
    repaint();
}