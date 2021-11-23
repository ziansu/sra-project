public void actionPerformed(java.awt.event.ActionEvent e) {
    if (java.awt.SystemTray.isSupported()) {
        net.sf.memoranda.ui.App.disposeWindow();
    }else {
        net.sf.memoranda.ui.App.closeWindow();
    }
}