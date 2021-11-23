public void setCategory(java.lang.String category) {
    if (category == (MarkupConstants.PHARMACEUTICAL_CATEGORY))
        this.category = MarkupConstants.PHARMACEUTICAL_CATEGORY;
    else
        if (category == (MarkupConstants.FOOD_CATEGORY))
            this.category = MarkupConstants.FOOD_CATEGORY;
        else
            if (category == (MarkupConstants.ELECTRONICS_CATEGORY))
                this.category = MarkupConstants.ELECTRONICS_CATEGORY;
            else {
                this.category = MarkupConstants.OTHER_CATEGORY;
            }
        
    
}