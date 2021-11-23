public void mouseDragged(java.awt.event.MouseEvent e) {
    if (((rightclicked) || (clicked)) || (middleclicked)) {
        mousex = e.getX();
        mousey = e.getY();
        if (((slideover) && (rightclicked)) && (!(middleclicked))) {
            mousedx = (-(mousex)) + (firstmousex);
            mousedy = (-(mousey)) + (firstmousey);
        }
    }
}