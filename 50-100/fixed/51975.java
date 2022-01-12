private void createControllers() {
    this.databaseController = new controller.DatabaseController();
    this.resultsController = new controller.ResultsController(databaseController);
    this.sessionController = new controller.SessionController(databaseController);
    this.qualityController = new controller.QualityController(databaseController);
    this.inputController = new controller.InputController(databaseController, sessionController, qualityController, resultsController);
    inputController.getAction();
}