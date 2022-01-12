public int getMaxHitpointsStamina() {
    return ((int) (java.lang.Math.ceil(((((double) (this.getWeight())) * ((double) (this.getToughness()))) / 50))));
}