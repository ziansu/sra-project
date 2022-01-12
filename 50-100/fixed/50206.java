@java.lang.Override
public void itemStateChanged(java.awt.event.ItemEvent e) {
    if ((e.getStateChange()) == (java.awt.event.ItemEvent.SELECTED)) {
        net.rptools.maptool.launcher.SetDPIAware.setKeyValue(true);
    }else
        if ((e.getStateChange()) == (java.awt.event.ItemEvent.DESELECTED)) {
            net.rptools.maptool.launcher.SetDPIAware.setKeyValue(false);
        }
    
}