@java.lang.Override
public void stateUpdated(org.eclipse.smarthome.core.items.Item item, org.eclipse.smarthome.core.types.State state) {
    oldGroupState = this.state;
    setState(function.calculate(members));
    if (oldGroupState.equals(this.state)) {
        sendGroupStateUpdatedEvent(item.getName(), this.state);
    }else {
        sendGroupStateChangedEvent(item.getName(), this.state, oldGroupState);
    }
}