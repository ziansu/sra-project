@java.lang.Override
protected void updateItem(de.subcentral.watcher.controller.settings.SettingsController.SettingsSection item, boolean empty) {
    super.updateItem(item, empty);
    if (empty || (item == null)) {
        setText("");
        setGraphic(null);
    }else {
        setText(item.getLabel());
        setGraphic(item.getImage());
    }
}