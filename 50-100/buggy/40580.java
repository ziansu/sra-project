private void formKeyPressed(java.awt.event.KeyEvent evt) {
    java.lang.System.out.println("Key Pressed");
    int key = evt.getKeyCode();
    if (key == (com.sun.glass.events.KeyEvent.VK_F1)) {
        if (!(SPZProductions.FRC.pit.display.SPZProductionsFRCPitDisplayUI.settings.isVisible())) {
            SPZProductions.FRC.pit.display.SPZProductionsFRCPitDisplayUI.settings.setVisible(true);
        }else {
            SPZProductions.FRC.pit.display.SPZProductionsFRCPitDisplayUI.settings.toFront();
            SPZProductions.FRC.pit.display.SPZProductionsFRCPitDisplayUI.settings.repaint();
        }
    }else
        if ((key == (com.sun.glass.events.KeyEvent.VK_F5)) || (key == (com.sun.glass.events.KeyEvent.VK_ESCAPE))) {
            SPZProductions.FRC.pit.display.SPZProductionsFRCPitDisplayUI.settings.fullscreenToggle();
        }
    
}