@com.google.gwt.uibinder.client.UiHandler(value = "help")
void onHelpClick(com.google.gwt.event.dom.client.ClickEvent e) {
    java.lang.Double size = dockLayoutPanel.getWidgetSize(eastPanel);
    if (size == 400) {
        setHelpSize(0, true);
        help.setText("Show Help");
    }else {
        setHelpSize(400, true);
        help.setText("Hide Help");
    }
}