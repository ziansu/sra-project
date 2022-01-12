@java.lang.Override
public void itemStateChanged(java.awt.event.ItemEvent e) {
    net.ntg.ftl.ui.TogglePanel.log.info(((("checkBox " + valueName) + ": ") + (enabledCheckBox.isSelected())));
    net.ntg.ftl.ui.TogglePanel.prefs.putBoolean((valueName + (net.ntg.ftl.ui.TogglePanel.ENABLED)), enabledCheckBox.isSelected());
}