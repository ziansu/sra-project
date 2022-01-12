@java.lang.Override
public void addModeChangeListener(com.comino.msp.main.control.listener.IMSPModeChangedListener listener) {
    if ((comm) != null)
        comm.addModeChangeListener(listener);
    
}