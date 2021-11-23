@java.lang.Override
public void itemStateChanged(java.awt.event.ItemEvent e) {
    if ((e.getStateChange()) == (java.awt.event.ItemEvent.SELECTED)) {
        net.ntg.ftl.ui.TogglePanel.log.info(((("comboBox " + valueName) + ": ") + (colorComboBox.getSelectedIndex())));
        net.ntg.ftl.ui.TogglePanel.prefs.putInt((valueName + (net.ntg.ftl.ui.TogglePanel.COLOR)), colorComboBox.getSelectedIndex());
    }
}