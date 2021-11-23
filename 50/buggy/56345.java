@java.lang.Override
protected void invalidated() {
    this.setValue(((get()) && ((getMinValue()) < 0) ? 0 : getMinValue()));
    fireUpdateEvent(REDRAW_EVENT);
}