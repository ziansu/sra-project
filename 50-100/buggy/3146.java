public void setupRobot() {
    org.team1540.quasarhelios.Elevator.setup();
    org.team1540.quasarhelios.Rollers.setup();
    org.team1540.quasarhelios.QuasarHelios.autoLoader = org.team1540.quasarhelios.AutoLoader.create();
    org.team1540.quasarhelios.QuasarHelios.autoEjector = org.team1540.quasarhelios.AutoEjector.create();
    org.team1540.quasarhelios.ControlInterface.setup();
    org.team1540.quasarhelios.HeadingSensor.setup();
    org.team1540.quasarhelios.DriveCode.setup();
    org.team1540.quasarhelios.Clamp.setup();
    org.team1540.quasarhelios.Autonomous.setup();
    org.team1540.quasarhelios.Pressure.setup();
    org.team1540.quasarhelios.QuasarHelios.publishFaultRConf();
}