@java.lang.Override
public void itemStateChanged(java.awt.event.ItemEvent e) {
    if ((e.getStateChange()) == (java.awt.event.ItemEvent.SELECTED)) {
        boolean success = net.rptools.maptool.launcher.SetDPIAware.setKeyValue(true);
        java.lang.System.out.println(("ON: key is now set to: " + success));
    }else
        if ((e.getStateChange()) == (java.awt.event.ItemEvent.DESELECTED)) {
            boolean success = net.rptools.maptool.launcher.SetDPIAware.setKeyValue(false);
            java.lang.System.out.println(("OFF: key is now set to: " + success));
        }
    
}