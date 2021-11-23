@java.lang.Override
public void setInverted(boolean b) {
    boolean changed = b != (this.inverted);
    if (!changed) {
        return ;
    }
    this.inverted = b;
    for (int i = 0; i < (this.controllerList.length); i++) {
        ((org.usfirst.frc.team449.robot.drive.tank.components.MotorCluster) (controllerList[i])).setInverted((!(((org.usfirst.frc.team449.robot.drive.tank.components.MotorCluster) (controllerList[i])).getInverted())));
    }
}