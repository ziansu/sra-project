public void switchToRepeatingPanel() {
    parentDialog.getContainer().dispose();
    controller.switchPanels(problematicCheckbox.isSelected());
}