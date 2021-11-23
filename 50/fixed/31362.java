void setProvidedStrength() {
    if ((generateRandomNumber()) > 50)
        this.providedStrength = generateRandomNumber();
    else
        this.providedStrength = Items.Item.MAXIMUM_STAT_POINTS;
    
}