@java.lang.Override
public void onValueChange(final com.google.gwt.event.logical.shared.ValueChangeEvent<java.lang.String> event) {
    com.google.gwt.core.client.Scheduler.get().scheduleEntry(new com.google.gwt.core.client.Scheduler.ScheduledCommand() {
        @java.lang.Override
        public void execute() {
            Console.MODULES.getEventBus().fireEvent(new org.jboss.as.console.client.domain.events.HostSelectionEvent(event.getValue()));
        }
    });
}