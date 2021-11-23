public boolean canGoNear(com.potatoes.cultivation.logic.UnitType type) {
    if (type.equals(com.potatoes.cultivation.logic.UnitType.Cannon))
        return true;
    
    return ((type.ordinal()) - (this.ordinal())) > 0;
}