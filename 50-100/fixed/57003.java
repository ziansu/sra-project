@java.lang.Override
public void windowLostFocus(java.awt.event.WindowEvent e) {
    java.awt.Window focusGained = e.getOppositeWindow();
    if (focusGained instanceof javax.swing.RootPaneContainer) {
        javax.swing.RootPaneContainer container = ((javax.swing.RootPaneContainer) (focusGained));
        if ((container.getContentPane()) instanceof com.teej107.netsearch.swing.PreferencesPanel)
            return ;
        
    }
    setVisible(false);
    if (!(isFullscreen())) {
        searchPreferences.setWindowLocation(getLocation());
    }
}