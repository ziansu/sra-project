@java.lang.Override
protected void initPanel() {
    com.google.gwt.user.client.ui.HTML helpPanel = new com.google.gwt.user.client.ui.HTML(ua.nure.ostpc.malibu.shedule.parameter.AppConstants.TEXT__HTML_HELP_EMP_PANEL);
    helpPanel.setTitle(AppConstants.TEXT__HELP_EMP_PANEL);
    helpPanel.setStyleName("helpPanel");
    add(helpPanel);
    super.initPanel();
}