private void initializeLevel() {
    if (!(PlayerMode.SURVIVAL.equals(nl.joshuaslik.tudelft.SEM.model.container.GameInfo.getInstance().getPlayerMode()))) {
        for (nl.joshuaslik.tudelft.SEM.control.gameObjects.IPhysicsObject e : nl.joshuaslik.tudelft.SEM.model.container.Levels.getLevelObjects(((nl.joshuaslik.tudelft.SEM.control.gameObjects.IGameObjects) (this)))) {
            addObject(e);
        }
    }else {
        for (nl.joshuaslik.tudelft.SEM.control.gameObjects.IPhysicsObject e : nl.joshuaslik.tudelft.SEM.model.container.Levels.getSurvivalLevelObjects(((nl.joshuaslik.tudelft.SEM.control.gameObjects.IGameObjects) (this)))) {
            addObject(e);
        }
    }
}