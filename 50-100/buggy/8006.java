public boolean equals(java.lang.Object o) {
    if (o instanceof FoodItem) {
        FoodItem i = ((FoodItem) (o));
        return (this.itemName.equals(i.itemName)) && (this.tagCode.equals(i.tagCode));
    }else
        if (o instanceof java.lang.String) {
            return this.tagCode.equals(((java.lang.String) (o)));
        }
    
    return false;
}