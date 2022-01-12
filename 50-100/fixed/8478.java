public void switchState(org.usfirst.frc.team2984.robot.subsystems.DriveTrain.State state) {
    if (state == (this.driveState)) {
        return ;
    }
    if (state == null) {
        state = this.driveState;
    }
    switch (state) {
        case VOLTAGE_CONTROL :
            this.configureTalonsVoltage();
            break;
        case SPEED_CONTROL :
            this.configureTalonsSpeed();
            break;
        case DISTANCE_CONTROL :
            this.configureTalonsDistance();
    }
    this.driveState = state;
}