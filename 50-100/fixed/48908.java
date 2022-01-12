private void addSystems() {
    dclib.geometry.UnitConverter unitConverter = new dclib.geometry.UnitConverter(dc.slideracer.level.LevelController.PIXELS_PER_UNIT, camera);
    entitySystemManager.add(moveWithCameraSystem);
    entitySystemManager.add(new dc.slideracer.epf.systems.CollisionSystem());
    entitySystemManager.add(new dc.slideracer.epf.systems.RacerInputSystem(unitConverter));
    entitySystemManager.add(new dc.slideracer.epf.systems.WaypointsSystem());
    entitySystemManager.add(new dclib.epf.systems.DrawableSystem(unitConverter));
}