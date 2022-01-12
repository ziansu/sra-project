@java.lang.Override
public void performCourseFollowingStep() {
    float currentAngle = this.getCurrentGyro();
    if ((java.lang.Math.abs(((this.courseFollowingAngle) - currentAngle))) >= 1) {
        this.turn(((int) ((this.courseFollowingAngle) - currentAngle)));
    }else {
        this.forward();
    }
}