private void initializeLevel() {
    if (!(nl.joshuaslik.tudelft.SEM.model.container.GameInfo.getInstance().getPlayerMode().equals(PlayerMode.SURVIVAL))) {
        for (nl.joshuaslik.tudelft.SEM.control.gameObjects.IPhysicsObject e : nl.joshuaslik.tudelft.SEM.model.container.Levels.getLevelObjects(((nl.joshuaslik.tudelft.SEM.control.gameObjects.IGameObjects) (this)))) {
            addObject(e);
        }
    }else {
        for (nl.joshuaslik.tudelft.SEM.control.gameObjects.IPhysicsObject e : nl.joshuaslik.tudelft.SEM.model.container.Levels.getSurvivalLevelObjects(((nl.joshuaslik.tudelft.SEM.control.gameObjects.IGameObjects) (this)))) {
            addObject(e);
        }
    }
}