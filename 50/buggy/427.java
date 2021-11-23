public static void addEntityView(ru.resolutionpoint.edu.animals.model.Entity entity) {
    if (entity != null)
        ru.resolutionpoint.edu.animals.view.EntitiesPanel.entities.add(new ru.resolutionpoint.edu.animals.view.EntityView(entity));
    
    java.lang.System.out.println("new entity");
}