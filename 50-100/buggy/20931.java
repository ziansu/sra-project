@java.lang.Override
protected void reset() {
    super.reset();
    for (int i = 0; i < (animations.length); i++) {
        synchronized(animations[i]) {
            animations[i].clear();
        }
    }
}