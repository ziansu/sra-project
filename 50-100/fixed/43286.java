public void drive() {
    hu.oe.nik.szfmv17t.automatedcar.bus.VirtualFunctionBus.loop();
    position.getCenter().setX(powertrainSystem.getX());
    position.getCenter().setX(powertrainSystem.getY());
    wheelAngle = ((float) (powertrainSystem.getWheelAngle()));
    this.speed = this.powertrainSystem.getVelocity();
    java.lang.System.out.println(speed);
}