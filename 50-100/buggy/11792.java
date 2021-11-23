private double getMaxHitpointsStamina() {
    return ((double) (java.lang.Math.ceil(((((double) (this.getWeight())) * ((double) (this.getToughness()))) / 50))));
}