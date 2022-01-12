public void select(int index) {
    if (this.selections.isEmpty()) {
        throw new java.lang.IndexOutOfBoundsException("Cannot select from empty group");
    }
    musicGame.gui.MenuSelection newSelection = this.selections.get(index);
    if (!(newSelection.isSelected())) {
        if (this.currentSelection.isSelected()) {
            this.currentSelection.toggleSelect();
        }
        this.currentSelection = newSelection;
        this.currentSelection.toggleSelect(true);
    }
}