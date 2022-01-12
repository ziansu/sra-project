public com.google.gwt.user.client.Command getCommand(hdm.itprojekt.texty.client.Showcase showcase) {
    final hdm.itprojekt.texty.client.Showcase loadShowcase = showcase;
    com.google.gwt.user.client.Command cmd = new com.google.gwt.user.client.Command() {
        public void execute() {
            com.google.gwt.user.client.ui.RootPanel.get("Details").clear();
            com.google.gwt.user.client.ui.RootPanel.get("Navigator").clear();
            loadShowcase.onLoad();
        }
    };
    return cmd;
}