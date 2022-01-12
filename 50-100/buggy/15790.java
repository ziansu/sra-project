@java.lang.Override
public scr.Action defaultControl(scr.Action action, scr.SensorModel sensors) {
    if (action == null) {
        action = new scr.Action();
    }
    allNN.updateActions(sensors);
    action.steering = getSteering(sensors);
    if ((sensors.getSpeed()) < 61) {
        action.accelerate = 1;
    }
    action.brake = getBraking(sensors);
    action.brake = getAcceleration(sensors);
    return action;
}