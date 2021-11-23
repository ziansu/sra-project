@java.lang.Override
public void update(long songTime) {
    setY(((GameScreen.BAR_POSITION) + (((((beatTimeMillis) - songTime) + (GameScreen.visualOffsetMillis)) * (GameScreen.HIT_OBJECT_DISTANCE)) / (millisFor4Beats))));
    if ((songTime - (beatTimeMillis)) > (holdDurationMillis)) {
        BeatMap.hitFlagString = BeatMap.HITFLAGSTRINGS[4];
        onRelease();
    }
}