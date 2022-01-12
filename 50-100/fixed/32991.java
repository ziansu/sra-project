@java.lang.Override
public void eventDispatched(java.awt.AWTEvent event) {
    if ((event instanceof java.awt.event.MouseEvent) && ((((java.awt.event.MouseEvent) (event)).getClickCount()) > 0)) {
        java.lang.Object source = event.getSource();
        if (source != (encodingScrollPane.getVerticalScrollBar())) {
            popup.hide();
            java.awt.Toolkit.getDefaultToolkit().removeAWTEventListener(this);
            if (source != encodingList) {
                encodingList.removeListSelectionListener(encodingListSelectionListener);
            }
        }
    }
}