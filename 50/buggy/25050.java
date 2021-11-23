public void setModel(model.data.DataModel model) {
    this.model = model;
    tableViewController.setDataModel(model);
    analysisController.setDataModel(model);
    visualizationController.setDataModel(model);
    visualizationController.initializeVisualisation();
}