@com.google.common.eventbus.Subscribe
public void onNewImage(org.micromanager.data.internal.NewImageEvent event) {
    (imagesReceived_)++;
    updateFPS(event.getImage());
    updateStatus(event.getImage());
}