@com.google.gwt.uibinder.client.UiHandler(value = "help")
void onHelpClick(com.google.gwt.event.dom.client.ClickEvent e) {
    java.lang.Double size = dockLayoutPanel.getWidgetSize(eastPanel);
    if (size == 400) {
        setHelpSize(0, false);
        help.setText("Show Help");
    }else {
        setHelpSize(400, false);
        help.setText("Hide Help");
    }
}