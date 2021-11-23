protected void doUpdate() {
    if (hasMarblePanel()) {
        marblePanel.update();
    }
    if (hasAnimPanel()) {
        animPanel.update();
    }
    if (isItemChecBox()) {
        updateCheckBox();
    }else
        if (isItemNumeric()) {
            updateNumerics();
        }else {
            if ((!(isInputTreeItem())) && (isDefinitionAndValue())) {
                buildItemContent();
            }else {
                updateTextItems();
            }
        }
    
}