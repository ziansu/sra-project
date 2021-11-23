@com.google.common.eventbus.Subscribe
public void onDirtiesSaveEvent(edu.wpi.grip.core.events.DirtiesSaveEvent dirtySaveEvent) {
    if ((!(saveIsDirty.get())) && (dirtySaveEvent.doesDirtySave())) {
        saveIsDirty.set(true);
    }
}