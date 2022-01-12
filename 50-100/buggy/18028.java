public void drive() {
    hu.oe.nik.szfmv17t.automatedcar.bus.VirtualFunctionBus.loop();
    this.speed = this.powertrainSystem.getVelocity();
    this.setDirectionAngle(powertrainSystem.getSteeringAngle(this.speed));
    this.setAxisAngle(((-1) * (this.getDirectionAngle())));
}