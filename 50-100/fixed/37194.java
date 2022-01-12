@java.lang.Override
public void removePassenger(net.minecraft.entity.Entity passenger) {
    super.removePassenger(passenger);
    if (this.getBlasting()) {
        passenger.motionX += (this.motionX) * 1.5;
        passenger.motionY += (this.motionY) * 1.5;
        passenger.motionZ += (this.motionZ) * 1.5;
    }
}