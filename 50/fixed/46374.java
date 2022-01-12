protected float getCurrentFrame(float delta) {
    frame += delta;
    if (((frame) >= 1) && ((callbackFinish) != null)) {
        callbackFinish.finish(this);
        finish();
    }
    return frame;
}