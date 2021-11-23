public boolean equals(java.lang.Object o) {
    if (o instanceof FoodItem) {
        FoodItem i = ((FoodItem) (o));
        return (this.itemName.equals(i.itemName)) && (this.tagCode.equals(i.tagCode));
    }else
        if (o instanceof char[]) {
            return this.tagCode.equals(((char[]) (o)));
        }
    
    return false;
}