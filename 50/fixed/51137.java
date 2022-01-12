@java.lang.Override
public void handleEvent(Event e) {
    if ((e.button) == 3) {
        setCurrent();
        onMouseRightClick(e);
    }
}