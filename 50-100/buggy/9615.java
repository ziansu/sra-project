@java.lang.Override
public void mouseDragged(java.awt.event.MouseEvent e) {
    if (((e.getX()) >= 0) && ((e.getX()) <= (this.getWidth()))) {
        if (knob1Picked) {
            moveKnob1(e.getX());
            return ;
        }
        if (knob2Picked) {
            moveKnob2(e.getX());
        }
    }
}