public void tick(float dt) {
    if (((running) && (!(stopped))) && (!(interrupted))) {
        if ((accumulator) >= (limit)) {
            stoppedAction.run();
            stopped = true;
        }
        tickAction.accept(accumulator, limit);
        accumulator += dt;
    }
}