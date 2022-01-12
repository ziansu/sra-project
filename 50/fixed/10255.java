public void update() {
    if (climb)
        motor.set(((speed) * (speedCoeff)));
    else
        motor.set(0);
    
}