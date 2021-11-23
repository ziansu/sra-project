public final void beforeLocationChange(final control.interfaces.MoveEvent _ev, final control.interfaces.MoveEvent _evOld) {
    cp.changeLocationSelectionOnScroll(_ev.getPnt_bottomLocation().x, _ev.getPnt_bottomLocation().y);
}