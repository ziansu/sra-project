public void process(float deltaTime) {
    processSystem(deltaTime);
    processAllPending(this::processEvent);
}