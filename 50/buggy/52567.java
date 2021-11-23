@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent e) {
    java.lang.System.out.println("change listenr called");
    replayIndex = jSlider.getValue();
    repaint(replayIndex);
}