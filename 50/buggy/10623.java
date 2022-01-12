@java.lang.Override
public void eventLoaded(org.openhab.io.caldav.CalDavEvent event) {
    this.handleForEventMap(event, org.openhab.binding.caldav_command.internal.CalDavBinding.SCOPE_BEGIN);
    this.handleForEventMap(event, org.openhab.binding.caldav_command.internal.CalDavBinding.SCOPE_END);
}