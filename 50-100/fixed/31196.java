@java.lang.Override
public void populateMotorCluster() {
    edu.wpi.first.wpilibj.VictorSP motor;
    for (int i = 0; i < (tankMap.leftCluster.cluster.motors.length); i++) {
        motor = new edu.wpi.first.wpilibj.VictorSP(tankMap.leftCluster.cluster.motors[i].PORT);
        motor.setInverted(false);
        addMotorClusterSlave(motor);
    }
}