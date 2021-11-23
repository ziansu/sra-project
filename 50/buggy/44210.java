public double checkDeadZone(double side) {
    if ((java.lang.Math.abs(side)) >= (deadZone))
        side = 0;
    
    return side;
}