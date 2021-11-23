public void dodge() {
    if ((!(jumping)) || (!(hit))) {
        body.setTransform(getUserData().getDodgePosition(), getUserData().getDodgeAngle());
        dodging = true;
    }
}