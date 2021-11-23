public int chooseRandomExcluding(int excluding, java.util.List<java.lang.Integer> conflicts) {
    boolean avoidLast = (conflicts.size()) == 0;
    int randomNum = this.weightedRandom(excluding, conflicts);
    return randomNum;
}