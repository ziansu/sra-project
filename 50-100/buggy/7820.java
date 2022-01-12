@java.lang.Override
public void onEvent(eu.dlvm.domotics.base.Block source, eu.dlvm.domotics.events.EventType event) {
    switch (event) {
        case ON :
            on();
            break;
        case OFF :
            reallyOff();
            break;
        case TOGGLE :
            toggle();
            break;
        case DELAY_ON :
            delayOn();
            break;
        case DELAY_OFF :
            delayOff();
            break;
        default :
            eu.dlvm.domotics.actuators.Fan.logger.warn(((("Ignored event " + event) + " from ") + (source.getName())));
    }
}