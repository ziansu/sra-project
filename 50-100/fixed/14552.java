public void tick(float dt) {
    if (((running) && (!(stopped))) && (!(interrupted))) {
        if ((accumulator) >= (limit)) {
            stoppedAction.run();
            stopped = true;
            running = false;
        }
        tickAction.accept(accumulator, limit);
        accumulator += dt;
    }
}