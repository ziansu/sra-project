void setProvidedStrength() {
    if ((Items.Item.generateRandomNumber()) > 50)
        this.providedStrength = Items.Item.generateRandomNumber();
    else
        this.providedStrength = Items.Item.MAXIMUM_STAT_POINTS;
    
}