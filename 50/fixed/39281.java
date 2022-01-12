public boolean onDistanceTarget() {
    for (org.team1515.botswana.subsystems.MecanumWheel wheel : wheels) {
        if (!(wheel.onDistanceTarget())) {
            return false;
        }
    }
    return true;
}