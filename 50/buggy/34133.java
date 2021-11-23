private void runSettings(java.util.List<java.lang.String> list) {
    this.controller.setRowAndColumnAndBombs(list, true);
    this.controller.notifyIfSettingsSet();
}