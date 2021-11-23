public void addEntity(java.util.List<ru.resolutionpoint.edu.animals.model.Entity> entities) {
    ru.resolutionpoint.edu.animals.model.Environment environment = ru.resolutionpoint.edu.animals.model.Environment.getEnvironment();
    java.util.List<ru.resolutionpoint.edu.animals.model.Entity> entityList = environment.getEntities();
    for (ru.resolutionpoint.edu.animals.model.Entity entity : entities) {
        entityList.add(entity);
    }
    environment.setEntities(entityList);
}