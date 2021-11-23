private void runSettings(java.util.List<java.lang.String> list) {
    controller.setRowAndColumnAndBombs(list, true);
    controller.notifyIfSettingsSet();
}