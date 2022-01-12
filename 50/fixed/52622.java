@com.google.common.eventbus.Subscribe
public void segmentDeselected(com.vistatec.ocelot.events.SegmentDeselectionEvent e) {
    clearSelection();
}