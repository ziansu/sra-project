@java.lang.Override
public void getAddCentury() {
    addCenturyPresenter.getSelectedValues().clear();
    addCenturyPresenter.getView().resetPopupHilightedData();
    if ((getView().getSelectedCenturyValuesThroughAutosuggest().size()) > 0) {
        addCenturyPresenter.setAddResourceData(getView().getSelectedCenturyValuesThroughAutosuggest());
    }
    addToPopupSlot(addCenturyPresenter);
    getView().OnCenturyClickEvent(addCenturyPresenter.getAddButton());
}