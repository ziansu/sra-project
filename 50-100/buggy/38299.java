private int getTotalScore(java.util.ArrayList<java.lang.Integer> probabilityVector) {
    int total = 0;
    java.util.HashMap<java.lang.String, java.lang.Integer> probVec = this.region.probabilityVector;
    total += probVec.get("combat");
    total += probVec.get("move");
    total += probVec.get("idle");
    return total;
}