@java.lang.Override
protected void end() {
    if (!(state)) {
        parent.toggleTransformed();
    }
    state = true;
    panel.transformAngle = 1;
    parent.onEndAnimation();
    parent.repaint();
}