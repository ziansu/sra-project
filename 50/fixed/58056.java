public void setRequiredDexterity(int requiredDexterity) {
    if (requiredDexterity < (Items.Item.MIN_STAT_POINTS)) {
        this.requiredDexterity = Items.Item.MIN_STAT_POINTS;
    }else
        if (requiredDexterity > (Items.Item.MAXIMUM_STAT_POINTS)) {
            this.requiredDexterity = Items.Item.MAXIMUM_STAT_POINTS;
        }else
            this.requiredDexterity = requiredDexterity;
        
    
}