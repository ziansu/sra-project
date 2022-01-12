@java.lang.Override
public int getRotateTicks() {
    io.github.thunderbots.lightning.hardware.Motor[] motors = this.getMotorSet().getMotorArray();
    int sum = (((motors[0].getEncoder().getPosition()) + (motors[2].getEncoder().getPosition())) + (motors[1].getEncoder().getPosition())) + (motors[3].getEncoder().getPosition());
    return sum / 4;
}