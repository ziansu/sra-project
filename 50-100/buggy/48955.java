private double getWalkingSpeed(double target_z) {
    if (((this.getLocation().get(2)) - target_z) == (-1)) {
        return 0.5 * (this.getBaseSpeed());
    }else
        if (((this.getLocation().get(2)) - target_z) == 1) {
            return 1.2 * (this.getBaseSpeed());
        }else {
            return this.getBaseSpeed();
        }
    
}