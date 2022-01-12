private void initialize(com.google.common.eventbus.EventBus eventBus, java.lang.String path) throws java.io.IOException {
    com.google.common.base.Preconditions.checkNotNull(eventBus, "Event Bus was null.");
    com.google.common.base.Preconditions.checkNotNull(path, "Path was null");
    this.path = path;
    this.name = com.google.common.io.Files.getNameWithoutExtension(this.path);
    this.outputSocket = new edu.wpi.grip.core.OutputSocket(eventBus, imageOutputHint);
    this.loadImage(path);
}