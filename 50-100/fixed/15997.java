@java.lang.Override
public void itemStateChanged(java.awt.event.ItemEvent e) {
    if ((e.getStateChange()) == (java.awt.event.ItemEvent.SELECTED)) {
        titleField.setEditable(false);
        extStateField.setEditable(false);
        refreshIntervalField.setEditable(false);
        queryIntervalField.setEditable(true);
        urlForSettingsField.setEditable(true);
    }else {
        titleField.setEditable(true);
        extStateField.setEditable(true);
        refreshIntervalField.setEditable(true);
        queryIntervalField.setEditable(true);
        urlForSettingsField.setEditable(true);
    }
}