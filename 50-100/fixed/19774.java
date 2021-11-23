@java.lang.Override
public boolean handleEvent(final java.awt.Event e) {
    switch (e.id) {
        case java.awt.Event.MOUSE_DOWN :
            assert false;
            return true;
        case java.awt.Event.MOUSE_UP :
            assert false;
            repaint();
            return true;
        case java.awt.Event.MOUSE_MOVE :
            return true;
        case java.awt.Event.MOUSE_DRAG :
            repaint();
            return true;
        case java.awt.Event.WINDOW_DESTROY :
            java.lang.System.exit(0);
            return true;
        case java.awt.Event.MOUSE_EXIT :
            return true;
        case java.awt.Event.MOUSE_ENTER :
            return true;
        default :
            return false;
    }
}