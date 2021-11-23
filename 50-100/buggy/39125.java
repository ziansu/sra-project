protected void refreshButtons(int amount) {
    clearButtons();
    for (int i = 0; i < (limitNumberOfButtons(amount)); ++i)
        refreshButton(i);
    
    if (canFitNewEmptyEntry())
        makeNewEmptyEntry();
    
    resetMenuDimensions();
}