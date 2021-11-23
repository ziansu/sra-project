public int adjustComputerBuilders(int amount) {
    int difference = amount;
    if (((computerBuilders) < (java.lang.Math.abs(difference))) && (amount < 0)) {
        difference = -(computerBuilders);
        computerBuilders = 0;
    }else {
        computerBuilders += amount;
    }
    if (difference != 0)
        gi.setComputerBuildersLabelChangeText(difference);
    
    return difference;
}