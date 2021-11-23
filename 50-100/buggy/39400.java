public void onLoad() {
    reportPanel.add(ueberSchrift1);
    reportPanel.add(nutzerAboDropDown);
    reportPanel.add(report2Generieren);
    com.google.gwt.user.client.ui.RootPanel.get("content").clear();
    com.google.gwt.user.client.ui.RootPanel.get("content").add(reportPanel);
    report2Generieren.addClickHandler(new com.google.gwt.event.dom.client.ClickHandler() {
        @java.lang.Override
        public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
            if (((auswahlIdReport2) != 0) && ((nutzerAboDropDown.getSelectedIndex()) > 0)) {
            }
        }
    });
}