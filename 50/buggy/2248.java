@java.lang.Override
protected void end() {
    if (!(state)) {
        parent.toggleTransformed();
    }
    state = true;
    panel.transformAngle = 0;
    parent.onEndAnimation();
    parent.repaint();
}