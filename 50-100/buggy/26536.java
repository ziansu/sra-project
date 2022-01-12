@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent e) {
    if ((e.getSource()) instanceof javax.swing.JSlider) {
        javax.swing.JSlider slide = ((javax.swing.JSlider) (e.getSource()));
        if (slide.getValueIsAdjusting()) {
            if (((slide.getValue()) % 4) == 0) {
                listener.actionPerformed(new java.awt.event.ActionEvent(e, 0, actionSlider));
            }
        }
    }
}