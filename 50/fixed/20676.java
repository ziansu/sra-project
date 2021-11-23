@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent e) {
    applySettings();
    afSkipInterval_.setValue(acqEng_.getAfSkipInterval());
}