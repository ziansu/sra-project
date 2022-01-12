void setRequiredLevel(int requiredLevel) {
    if (requiredLevel < (Items.Item.MIN_LEVEL)) {
        this.requiredLevel = Items.Item.MIN_LEVEL;
    }else
        if (requiredLevel > (Items.Item.MAX_LEVEL)) {
            this.requiredLevel = Items.Item.MAX_LEVEL;
        }else
            this.requiredLevel = requiredLevel;
        
    
}