void highlightMe(gui.mainscreen.searchbar.SuggestionEntry se) {
    gui.mainscreen.searchbar.SuggestionList.setHighlighted(se);
    ((gui.mainscreen.searchbar.SearchPanel) (getParent())).updateHighlight(se.getSubstance().getFormula());
}