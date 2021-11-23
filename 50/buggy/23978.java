void setRequiredLevel(int requiredLevel) {
    if (requiredLevel < (Items.Item.MIN_LEVEL)) {
        this.requiredLevel = 1;
    }else
        if (requiredLevel > (Items.Item.MAX_LEVEL)) {
            this.requiredLevel = 99;
        }else
            this.requiredLevel = requiredLevel;
        
    
}