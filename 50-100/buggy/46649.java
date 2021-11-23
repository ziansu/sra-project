public void aim(communication.ports.interfaces.RobotPort port, double rotation) {
    double front = rotation * (this.MAX_ROTATION);
    double left = rotation * (this.MAX_ROTATION);
    double back = (-rotation) * (this.MAX_ROTATION);
    double right = (-rotation) * (this.MAX_ROTATION);
    ((communication.ports.interfaces.FourWheelHolonomicRobotPort) (port)).fourWheelHolonomicMotion(front, back, left, right);
}