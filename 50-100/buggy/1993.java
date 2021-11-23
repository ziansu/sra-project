public void raiseEvent_OnEventDispatchThread(java.awt.event.ActionEvent event) {
    java.lang.Runnable action = () -> {
        for (java.awt.event.ActionListener a : EDTlisteners) {
            a.actionPerformed(event);
        }
    };
    if (javax.swing.SwingUtilities.isEventDispatchThread()) {
        action.run();
    }else {
        javax.swing.SwingUtilities.invokeLater(action);
    }
}