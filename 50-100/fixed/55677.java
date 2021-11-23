public void displayStatus(java.lang.String receivedString) {
    assert receivedString != null;
    if (receivedString == null) {
        receivedString = GuiUtil.EMPTY_STRING;
    }else
        if (udo.gui.GuiUtil.isWarning(receivedString)) {
            udo.gui.HomeController.statusString.setTextFill(GuiUtil.COLOUR_TEXT_WARNING);
        }else
            if (udo.gui.GuiUtil.isError(receivedString)) {
                udo.gui.HomeController.statusString.setTextFill(GuiUtil.COLOUR_TEXT_ERROR);
            }else {
                udo.gui.HomeController.statusString.setTextFill(GuiUtil.COLOUR_TEXT_NORMAL);
            }
        
    
    udo.gui.HomeController.statusString.setText(receivedString);
    udo.gui.HomeController.logger.finer(receivedString);
}