private void processArrayList() {
    ui.controller.UIController uiController = ui.controller.UIController.getInstance(null);
    java.lang.String[] output = uiController.format(taskList);
    appendTexts(textArea, output);
}