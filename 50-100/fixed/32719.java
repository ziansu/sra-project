public boolean isFourOfAKind() {
    boolean canMakeDedication = false;
    int count = 1;
    for (project.Color c : project.Color.values()) {
        if ((numOfCardColor(c)) >= 4) {
            if (count <= 1) {
                fourOfaKindList.add(c);
                canMakeDedication = true;
                count++;
            }
        }
    }
    return canMakeDedication;
}