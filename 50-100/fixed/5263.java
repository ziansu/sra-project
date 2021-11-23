@java.lang.Override
public void onModuleLoad() {
    com.google.gwt.core.client.Scheduler.get().scheduleDeferred(new com.google.gwt.core.client.Scheduler.ScheduledCommand() {
        @java.lang.Override
        public void execute() {
            com.google.gwt.user.client.ui.RootPanel.get().removeStyleName(com.vaadin.client.BrowserInfo.get().getCSSClass());
        }
    });
    com.vaadin.elements.grid.GridEntryPoint.removePrivateApi();
}