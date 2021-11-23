@com.google.gwt.uibinder.client.UiHandler(value = "browseCentury")
public void onClickOfBrowseCentury(com.google.gwt.event.dom.client.ClickEvent e) {
    centuryPopup.clear();
    if (((centurySelectedValues) != null) && ((centurySelectedValues.size()) > 0)) {
        centuryPresenterWidget.setAddResourceData(centurySelectedValues);
    }
    centuryPopup.add(centuryPresenterWidget.getWidget());
    centuryPopup.show();
    centuryPopup.center();
    centuryPopup.getElement().getStyle().setZIndex(999999);
}