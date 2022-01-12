private void buildItemWithTwoRows() {
    createDVPanels();
    java.lang.String text = getLatexString(isInputTreeItem(), org.geogebra.web.web.gui.view.algebra.RadioTreeItem.LATEX_MAX_EDIT_LENGHT);
    latex = text != null;
    ihtml.clear();
    if (updateDefinitionPanel()) {
        plainTextItem.clear();
        plainTextItem.add(definitionPanel);
    }
    if (updateValuePanel(text)) {
        outputPanel.add(valuePanel);
        plainTextItem.add(outputPanel);
    }
    ihtml.add(plainTextItem);
}