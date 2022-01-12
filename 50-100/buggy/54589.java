public void mouseClicked(java.awt.event.MouseEvent e) {
    if ((((dx) == 0) && ((dy) == 0)) && ((a) == 0)) {
        getVelocities(e.getX(), e.getY());
        anim.start();
    }else {
        anim.interrupt();
        randomizeBallLocation();
        panel.repaint();
    }
}