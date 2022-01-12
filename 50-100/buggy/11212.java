public void setRuntime(long runtime) {
    if ((this.pauseTime) > 0) {
        this.startTime = (this.pauseTime) - runtime;
    }else {
        this.startTime = (com.badlogic.gdx.utils.TimeUtils.millis()) - runtime;
    }
}