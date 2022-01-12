private void setGeschwindigkeitSpezifisch(int percent, project.Direction lr) {
    percent = validateOrCorrectPercent(percent);
    if (lr.equals(project.motors.LEFT)) {
        motorLinks.setSpeed(((percent * (project.motors.Motor.TOP_SPEED)) / 100));
    }else {
        motorRechts.setSpeed(((percent * (project.motors.Motor.TOP_SPEED)) / 100));
    }
}