public void raiseEvent_OnEventDispatchThread(java.awt.event.ActionEvent event) {
    java.lang.Runnable action = () -> {
        for (int a = 0; a < (EDTlisteners.size()); a++) {
            EDTlisteners.get(a).actionPerformed(event);
        }
    };
    if (javax.swing.SwingUtilities.isEventDispatchThread()) {
        action.run();
    }else {
        javax.swing.SwingUtilities.invokeLater(action);
    }
}