private static byui.cit260.whereisblackbeard.model.Map createMap() {
    byui.cit260.whereisblackbeard.model.Map map = new byui.cit260.whereisblackbeard.model.Map(20, 20);
    byui.cit260.whereisblackbeard.model.Scene scenes = byui.cit260.whereisblackbeard.control.MapControl.createScenes;
    byui.cit260.whereisblackbeard.control.GameControls.assignScenesToLocation(map, scenes);
    return map;
}