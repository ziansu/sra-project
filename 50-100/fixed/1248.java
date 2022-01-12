@java.lang.Override
public void stateUpdated(org.eclipse.smarthome.core.items.Item item, org.eclipse.smarthome.core.types.State state) {
    oldGroupState = this.state;
    setState(function.calculate(members));
    sendGroupStateChangedEvent(item.getName(), this.state, oldGroupState);
    sendGroupStateUpdatedEvent(item.getName(), this.state);
}