public boolean canPlaceComponent(gamemodel.ScreenComponent newComp, int x, int y) {
    if (!(contains(newComp, x, y)))
        return false;
    
    for (gamemodel.ScreenComponent comp : components)
        if ((comp != newComp) && (!(comp.isCompatible(newComp, x, y))))
            return false;
        
    
    return true;
}