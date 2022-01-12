private void calculateTorque() {
    switch (lastGearState) {
        case 0 :
            torque = 0;
            break;
        case -1 :
        case 1 :
            torque = (rpm) / 10;
            break;
        default :
            torque = ((rpm) / 10) - ((lastGearState) * 20);
            break;
    }
}