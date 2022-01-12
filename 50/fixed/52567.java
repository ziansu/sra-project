@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent e) {
    replayIndex = jSlider.getValue();
    repaint(replayIndex);
}