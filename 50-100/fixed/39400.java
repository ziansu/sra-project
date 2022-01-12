public void onLoad() {
    reportPanel.add(ueberSchrift1);
    reportPanel.add(nutzerAboDropDown);
    reportPanel.add(report2Generieren);
    com.google.gwt.user.client.ui.RootPanel.get("content").clear();
    com.google.gwt.user.client.ui.RootPanel.get("content").add(reportPanel);
}