private void getNewProcessingSystemsFromDatabase() {
    java.util.List<pl.edu.uj.fais.wpz.msom.entities.Model> models = modelService.findAll();
    for (pl.edu.uj.fais.wpz.msom.entities.Model m : models) {
        java.lang.Long id = m.getId();
        if (!(isProcessingSystemOnLocalList(id))) {
            pl.edu.uj.fais.wpz.msom.model.ProcessingSystemMockup processingSystem = new pl.edu.uj.fais.wpz.msom.model.ProcessingSystemMockup(m, controllerUnitService, distributionService, modelService, moduleService, pathService, taskService, taskTypeService);
            localProcessingSystems.add(processingSystem);
        }
    }
}