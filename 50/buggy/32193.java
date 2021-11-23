@java.lang.Override
public void timerTaskHandler() {
    (laneBaseHeight)++;
    for (crossyroad.Lane lane : lanes) {
        lane.update();
    }
}