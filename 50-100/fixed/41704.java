public static java.util.ArrayList<nl.joshuaslik.tudelft.SEM.control.gameObjects.PhysicsObject> getLevelObjects(int index, nl.joshuaslik.tudelft.SEM.control.gameObjects.IGameObjects gameObjects) {
    switch (index) {
        case 0 :
            return nl.joshuaslik.tudelft.SEM.model.container.Levels.createLevel0(gameObjects);
        case 1 :
            return nl.joshuaslik.tudelft.SEM.model.container.Levels.createLevel1(gameObjects);
        case 2 :
            return nl.joshuaslik.tudelft.SEM.model.container.Levels.createLevel2(gameObjects);
        case 3 :
            return nl.joshuaslik.tudelft.SEM.model.container.Levels.createLevel3(gameObjects);
        case 4 :
            return nl.joshuaslik.tudelft.SEM.model.container.Levels.createLevel4(gameObjects);
        default :
            return nl.joshuaslik.tudelft.SEM.model.container.Levels.createLevel4(gameObjects);
    }
}