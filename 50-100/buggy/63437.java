public boolean isThreePair() {
    boolean canMakeDedication = false;
    int count = 0;
    for (project.Color c : project.Color.values()) {
        if ((numOfCardColor(c)) >= 2) {
            threePairList.add(c);
            count++;
        }
    }
    if (count >= 3) {
        canMakeDedication = true;
    }
    return canMakeDedication;
}