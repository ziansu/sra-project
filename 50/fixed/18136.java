public void updateBackingStorage() {
    raise(new address.events.model.LocalModelChangedEvent(backingModel));
}