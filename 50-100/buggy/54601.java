public org.opensourcephysics.cabrillo.tracker.Step deleteStep(int n) {
    if (locked)
        return null;
    
    org.opensourcephysics.media.core.TPoint p = trackerPanel.getSelectedPoint();
    if (p instanceof org.opensourcephysics.media.core.PerspectiveFilter.Corner) {
        org.opensourcephysics.controls.XMLControl control = new org.opensourcephysics.controls.XMLControlElement(filter);
        org.opensourcephysics.media.core.PerspectiveFilter.Corner corner = ((org.opensourcephysics.media.core.PerspectiveFilter.Corner) (p));
        filter.deleteKeyFrame(n, corner);
        org.opensourcephysics.cabrillo.tracker.Undo.postFilterEdit(trackerPanel, filter, control);
        trackerPanel.repaint();
    }
    org.opensourcephysics.cabrillo.tracker.Step step = getStep(n);
    return step;
}