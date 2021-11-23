@java.lang.Override
public void handleEvent(Event e) {
    if ((e.button) == 3) {
        java.lang.System.out.println("GOT RIGHT_CLICK EVENT!!");
        setCurrent();
        onMouseRightClick(e);
    }
}