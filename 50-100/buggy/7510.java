@java.lang.Override
public void actOnBuildingChange(buildings.Building building, boolean remove, boolean clickedOn) {
    if ((!remove) && (!clickedOn)) {
        addToView(building);
        removePlaceTexture();
    }else
        if (!clickedOn)
            removeFromView(building.getSpriteAdapter());
        else
            if (remove && clickedOn) {
                removeFromView(building.getSpriteAdapter());
                removePlaceTexture();
            }
        
    
}