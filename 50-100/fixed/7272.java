@com.google.gwt.uibinder.client.UiHandler(value = "browseCentury")
public void onClickOfBrowseCentury(com.google.gwt.event.dom.client.ClickEvent e) {
    centuryPopup.clear();
    centuryPresenterWidget.setAddResourceData(centurySelectedValues);
    centuryPopup.add(centuryPresenterWidget.getWidget());
    centuryPopup.show();
    centuryPopup.center();
    centuryPopup.getElement().getStyle().setZIndex(999999);
}