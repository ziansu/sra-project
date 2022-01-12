public void autonomousPeriodic() {
    timer.reset();
    timer.start();
    while ((((isAutonomous()) && (isEnabled())) && ((timer.get()) <= 15)) && ((done) == false)) {
        switch (autoSelected) {
            case defaultAuto :
                DefaultAuto();
                break;
            case redAuton :
                RedAuton();
                break;
            case blueAuton :
                BlueAuton();
                break;
            case straight :
                straightGear();
        }
    } 
}