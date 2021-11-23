@java.lang.Override
public boolean onEnvironmentEvent(org.luwrain.app.cpanel.sects.EnvironmentEvent event) {
    org.luwrain.app.cpanel.sects.NullCheck.notNull(event, "event");
    switch (event.getCode()) {
        case EnvironmentEvent.SAVE :
            save();
            return true;
        case EnvironmentEvent.CLOSE :
            environment.close();
            return true;
        default :
            return super.onEnvironmentEvent(event);
    }
}