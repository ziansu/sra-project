public void deleteEntity(ru.resolutionpoint.edu.animals.model.Entity entity) {
    ru.resolutionpoint.edu.animals.model.Environment environment = ru.resolutionpoint.edu.animals.model.Environment.getEnvironment();
    java.util.List<ru.resolutionpoint.edu.animals.model.Entity> entityList = environment.getEntities();
    entityList.remove(entity);
    environment.setEntities(entityList);
    ru.resolutionpoint.edu.animals.view.EntitiesPanel.deleteEntityView(entity);
    environment.change();
}