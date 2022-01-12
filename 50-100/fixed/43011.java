public int visitBest() {
    lastVisit = bestChild();
    (visits)++;
    if ((childStats[lastVisit]) == null) {
        childStats[lastVisit] = new eredan.Stats();
    }
    (childStats[lastVisit].visits)++;
    return lastVisit;
}