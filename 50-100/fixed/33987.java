public void switchToDesignView() {
    com.google.appinventor.client.Ode.currentView = com.google.appinventor.client.Ode.DESIGNER;
    getTopToolbar().updateFileMenuButtons(com.google.appinventor.client.Ode.currentView);
    if ((currentFileEditor) != null) {
        deckPanel.showWidget(designTabIndex);
    }else {
        com.google.appinventor.client.output.OdeLog.wlog("No current file editor to show in designer");
        com.google.appinventor.client.ErrorReporter.reportInfo(com.google.appinventor.client.Ode.MESSAGES.chooseProject());
    }
}