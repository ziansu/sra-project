@java.lang.Override
public void itemStateChanged(java.awt.event.ItemEvent event) {
    if ((event.getItem()) == (a.chb1)) {
        if ((event.getStateChange()) == (java.awt.event.ItemEvent.SELECTED)) {
            Status.commType = 1;
        }
    }else
        if ((event.getItem()) == (a.chb3)) {
            Status.autoBreak = 1;
        }else
            if ((event.getItem()) == (a.chb4)) {
                Status.autoScroll = 1;
            }
        
    
}