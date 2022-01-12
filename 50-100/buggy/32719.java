public boolean isFourOfAKind() {
    boolean canMakeDedication = false;
    for (project.Color c : project.Color.values()) {
        if ((numOfCardColor(c)) >= 4) {
            fourOfaKindList.add(c);
            canMakeDedication = true;
        }
    }
    return canMakeDedication;
}