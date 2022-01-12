private void createControllers() {
    this.databaseController = new controller.DatabaseController();
    this.resultsController = new controller.ResultsController(databaseController);
    this.sessionController = new controller.SessionController(databaseController, resultsController);
    this.inputController = new controller.InputController(sessionController, databaseController, resultsController);
    this.qualityController = new controller.QualityController();
    inputController.getAction();
}