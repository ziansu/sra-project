void setProvidedMana() {
    if ((Items.Item.generateRandomNumber()) > 50)
        this.providedMana = Items.Item.generateRandomNumber();
    else
        this.providedMana = Items.Item.MIN_STAT_POINTS;
    
}