protected void setSelectedIndexOnClick(int index) {
    if (index != (_selectedTaskIndex.getValue())) {
        ((urgenda.gui.SimpleTaskController) (displayHolder.getChildren().get(_selectedTaskIndex.getValue()))).setSelected(false);
        _selectedTaskIndex.set(index);
    }
}