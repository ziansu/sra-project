private int getTotalScore() {
    int total = 0;
    java.util.HashMap<java.lang.String, java.lang.Integer> probVec = this.region.probabilityVector;
    total += probVec.get("combat");
    total += probVec.get("move");
    total += probVec.get("idle");
    return total;
}