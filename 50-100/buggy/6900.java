@java.lang.Override
public void mouseDragged(int oldx, int oldy, int newx, int newy) {
    if (!(active))
        return ;
    
    consumeEvent();
    if ((state) == (itdelatrisu.opsu.user.UserSelectOverlay.State.CREATE_USER))
        return ;
    
    int diff = newy - oldy;
    if (diff != 0)
        scrolling.dragged((-diff));
    
}