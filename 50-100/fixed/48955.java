private double getWalkingSpeed(double target_z) {
    java.lang.System.out.println(target_z);
    if (((this.getLocation().get(2)) - target_z) < 0) {
        return 0.5 * (this.getBaseSpeed());
    }else
        if (((this.getLocation().get(2)) - target_z) > 0) {
            return 1.2 * (this.getBaseSpeed());
        }else {
            return this.getBaseSpeed();
        }
    
}