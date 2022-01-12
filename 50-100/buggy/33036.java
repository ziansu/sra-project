public void addEntity(java.util.List<ru.resolutionpoint.edu.animals.model.Entity> entities) {
    ru.resolutionpoint.edu.animals.model.Environment environment = ru.resolutionpoint.edu.animals.model.Environment.getEnvironment();
    java.util.List<ru.resolutionpoint.edu.animals.model.Entity> entityList = environment.getEntities();
    for (ru.resolutionpoint.edu.animals.model.Entity entity : entities) {
        entityList.add(entity);
        ru.resolutionpoint.edu.animals.view.EntitiesPanel.addEntityView(entity);
    }
    environment.setEntities(entityList);
}