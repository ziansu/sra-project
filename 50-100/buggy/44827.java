void checkInput() {
    if ((com.aston.group.stationdefender.utils.Input.isColliding(x, y, width, height)) && ((hudElement) == null)) {
        hudElement = new com.aston.group.stationdefender.utils.hud.HudUnit(this, x, y);
        com.aston.group.stationdefender.utils.hud.Hud.addHudElement(hudElement);
    }else
        if (com.aston.group.stationdefender.utils.hud.Hud.isNotColliding()) {
            com.aston.group.stationdefender.utils.hud.Hud.removeHudElement(hudElement);
            hudElement = null;
        }
    
}