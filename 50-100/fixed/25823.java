public void onModuleLoad() {
    org.bbop.apollo.gwt.client.MainPanel mainPanel = org.bbop.apollo.gwt.client.MainPanel.getInstance(this);
    com.google.gwt.i18n.client.Dictionary dictionary = com.google.gwt.i18n.client.Dictionary.getDictionary("Options");
    java.lang.String rootUrl = dictionary.get("rootUrl");
    mainPanel.setRootUrl(rootUrl);
    org.bbop.apollo.gwt.client.RootLayoutPanel rp = org.bbop.apollo.gwt.client.RootLayoutPanel.get();
    rp.add(mainPanel);
    rp.setWidgetTopHeight(mainPanel, 0, Style.Unit.PX, 100, Style.Unit.PCT);
}