@java.lang.Override
public void update(float dt) {
    if ((elapsedOffset) < (offset)) {
        elapsedOffset += dt;
    }else {
        elapsedTime += dt;
        if (isDone()) {
            endStart();
        }else {
            nextState.setVolume((((originalVolume) * (elapsedTime)) / (totalTime)));
        }
    }
}