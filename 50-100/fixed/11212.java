public void setRuntime(long runtime) {
    if ((this.pauseTime) > 0) {
        this.startTime = (this.pauseTime) - runtime;
    }else {
        if ((this.startTime) <= (-1)) {
            this.pauseTime = com.badlogic.gdx.utils.TimeUtils.millis();
            this.startTime = (pauseTime) - runtime;
        }else {
            this.startTime = (com.badlogic.gdx.utils.TimeUtils.millis()) - runtime;
        }
    }
}