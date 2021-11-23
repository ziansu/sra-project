public void showWarningBar(java.lang.String warning) {
    if ((warningBar_) == null) {
        warningBar_ = new org.rstudio.studio.client.workbench.views.source.editors.text.InfoBar(InfoBar.WARNING, new com.google.gwt.event.dom.client.ClickHandler() {
            @java.lang.Override
            public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
                hideWarningBar();
            }
        });
        panel_.insertNorth(warningBar_, warningBar_.getHeight(), null);
    }
    warningBar_.setText(warning);
}