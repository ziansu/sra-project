public void execute() {
    br.com.tosin.si.project.models.Environment environment = br.com.tosin.si.project.generators.BuildMap.buildMap();
    br.com.tosin.si.project.ui.ShowUI.showWorldRender(environment.world);
    br.com.tosin.si.project.models.Agent agent = new br.com.tosin.si.project.models.Agent(8, 0);
    environment.addObstacle(agent);
    br.com.tosin.si.project.controllers.GameController gameController = new br.com.tosin.si.project.controllers.GameController();
    environment = br.com.tosin.si.project.generators.ProducesFruits.producesFruits(environment);
    br.com.tosin.si.project.ui.ShowUI.showWorldRender(environment.world);
    gameController.playGame(environment, agent);
}