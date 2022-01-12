private int switchGearDependOnSpeed(int actualGear, double actualVelocity) {
    if (actualGear > 1) {
        if ((actualGear < ((this.gearMaxVelocity.length) - 1)) && (actualVelocity >= (this.gearMaxVelocity[actualGear]))) {
            return ++actualGear;
        }else
            if ((actualVelocity != 0) && (actualVelocity <= (this.gearMaxVelocity[(actualGear - 1)]))) {
                return --actualGear;
            }
        
        return actualGear;
    }
    return 2;
}