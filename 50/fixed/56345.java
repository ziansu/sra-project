@java.lang.Override
protected void invalidated() {
    fireUpdateEvent(REDRAW_EVENT);
}