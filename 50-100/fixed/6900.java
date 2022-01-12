@java.lang.Override
public void mouseDragged(int oldx, int oldy, int newx, int newy) {
    if (!(active))
        return ;
    
    consumeEvent();
    int diff = newy - oldy;
    if (diff != 0)
        scrolling.dragged((-diff));
    
}