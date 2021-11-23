@java.lang.Override
void computeAction(torcs.scr.Action a, torcs.unstuck.UnstuckDriver d) {
    a.gear = d.controlGear();
    a.steering = ((torcs.unstuck.UnstuckDriver.OFFTRACK_ANGLE) * (java.lang.Math.signum(d.model.trackPosition))) + (d.model.angleToTrackAxis);
    a.accelerate = 0.5;
    a.brake = 0;
}