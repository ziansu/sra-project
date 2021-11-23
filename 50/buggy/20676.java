@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent e) {
    applySettings();
    afSkipInterval_.setValue(new java.lang.Integer(acqEng_.getAfSkipInterval()));
}