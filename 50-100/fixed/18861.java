@java.lang.Override
public void stateChanged(javax.swing.event.ChangeEvent e) {
    if ((main.gui.GUIFront.mainPanel.getSelectedIndex()) == 0) {
        main.gui.GUIFront.btnRoute.setEnabled(main.gui.GUIFront.mapViewButtons[0]);
        main.gui.GUIFront.btnClear.setEnabled(main.gui.GUIFront.mapViewButtons[1]);
    }else
        if ((main.gui.GUIFront.mainPanel.getSelectedIndex()) == 1) {
            storeButtonStates();
            main.gui.GUIFront.btnClear.setEnabled(false);
            main.gui.GUIFront.btnRoute.setEnabled(false);
        }
    
}