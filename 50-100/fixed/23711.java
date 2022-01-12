public void invalidate() {
    com.faforever.gw.model.entitity.Faction uniqueFaction = solarSystem.getUniqueOwner();
    javafx.scene.paint.Color backColor = (uniqueFaction == null) ? com.faforever.gw.ui.universe.SolarSystemController.DEFAULT_COLOR : uniqueFaction.getColor();
    planetCircle.setFill(backColor);
    if (isSelected) {
        planetCircle.setStroke(com.faforever.gw.ui.universe.SolarSystemController.SELECTED_COLOR);
    }else
        if (isHovered) {
            planetCircle.setStroke(com.faforever.gw.ui.universe.SolarSystemController.HOVER_COLOR);
        }else {
            planetCircle.setStroke(com.faforever.gw.ui.universe.SolarSystemController.DEFAULT_COLOR);
        }
    
}