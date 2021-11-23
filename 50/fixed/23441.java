private void setTimeStart() {
    if (((timeLimitStart) == 0) && ((getExistingDoors().size) >= 10)) {
        timeLimitStart = com.badlogic.gdx.utils.TimeUtils.millis();
    }
}