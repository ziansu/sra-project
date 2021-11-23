private double constrainSpeed(double speed) {
    if (speed < 0)
        return 0.0;
    else
        return 1.0;
    
}