@java.lang.Override
public void itemStateChanged(java.awt.event.ItemEvent e) {
    net.ntg.ftl.ui.TogglePanel.log.info(((("checkBox " + (enabledCheckBox.getToolTipText())) + ": ") + (enabledCheckBox.isSelected())));
    net.ntg.ftl.ui.TogglePanel.prefs.putBoolean((valueName + (net.ntg.ftl.ui.TogglePanel.ENABLED)), enabledCheckBox.isSelected());
}