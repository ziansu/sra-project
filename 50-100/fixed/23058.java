public void adjustmentValueChanged(java.awt.event.AdjustmentEvent e) {
    int v;
    java.awt.Scrollbar sb = ((java.awt.Scrollbar) (e.getSource()));
    if (sb == (speed)) {
        v = sb.getValue();
        if (v > (MAXIMUM)) {
            sb.setValue(MAXIMUM);
        }
        if (v < (MINIMUM)) {
            sb.setValue(MINIMUM);
        }
    }
}