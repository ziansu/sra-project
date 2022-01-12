public void pause() {
    if (((this.startTime) > 0) && ((pauseTime) <= (-1))) {
        this.pauseTime = com.badlogic.gdx.utils.TimeUtils.millis();
    }
}