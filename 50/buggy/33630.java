public void pause() {
    if ((pauseTime) <= (-1)) {
        this.pauseTime = com.badlogic.gdx.utils.TimeUtils.millis();
    }
}