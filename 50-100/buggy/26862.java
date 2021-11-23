@java.lang.Override
public void itemStateChanged(java.awt.event.ItemEvent e) {
    net.ntg.ftl.ui.TogglePanel.log.info(((("checkBox " + (isDeltaTypeCheckBox.getText())) + ": ") + (isDeltaTypeCheckBox.isSelected())));
    net.ntg.ftl.ui.TogglePanel.prefs.putBoolean((valueName + (net.ntg.ftl.ui.TogglePanel.DELTA)), isDeltaTypeCheckBox.isSelected());
}