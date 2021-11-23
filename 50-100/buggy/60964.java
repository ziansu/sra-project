@java.lang.Override
public void mouseMoved(java.awt.event.MouseEvent e) {
    if (isKnobHit(knob1pos, e.getX(), e.getY())) {
        knob1Picked = true;
        repaint();
        return ;
    }else {
        knob1Picked = false;
    }
    if (isKnobHit(knob2pos, e.getX(), e.getY())) {
        knob2Picked = true;
    }else {
        knob2Picked = false;
    }
    repaint();
}