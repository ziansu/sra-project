void keyEvent(java.awt.event.KeyEvent event) {
    if ((keyListener) != null)
        keyListener.onKeyEvent(event);
    
    for (soga2d.GraphicObject object : allItems())
        object.keyEvent(event);
    
}