private void buildItemWithTwoRows() {
    createDVPanels();
    java.lang.String text = getLatexString(isInputTreeItem(), org.geogebra.web.web.gui.view.algebra.RadioTreeItem.LATEX_MAX_EDIT_LENGHT);
    latex = text != null;
    if (updateDefinitionPanel()) {
    }
    plainTextItem.clear();
    plainTextItem.add(definitionPanel);
    if (updateValuePanel(text)) {
        outputPanel.add(valuePanel);
        plainTextItem.add(outputPanel);
        org.geogebra.common.util.debug.Log.debug("[AVR] Value panel is updated");
    }
    ihtml.clear();
    ihtml.add(plainTextItem);
}