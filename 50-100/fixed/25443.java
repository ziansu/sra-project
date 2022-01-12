public final void update() {
    if (this.active) {
        if ((this.lastNanoTime) == 0)
            this.update(0);
        else {
            float delta = ((java.lang.System.nanoTime()) - (this.lastNanoTime)) / (com.haku.lecs.system.BaseSystem.NANOS_TO_MILLIS);
            this.update(delta);
        }
        this.lastNanoTime = java.lang.System.nanoTime();
    }
}