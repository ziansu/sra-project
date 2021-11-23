public void mouseMoved(com.phyloa.dlib.dui.DMouseEvent e) {
    float my = (e.y) - (y);
    hover = ((int) (my / (ddd.height)));
    if ((((my < 0) || (my >= (height))) || ((e.x) < (x))) || ((e.x) > ((x) + (width)))) {
        hover = -1;
    }
}