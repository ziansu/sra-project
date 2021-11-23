public static void deleteEntityView(ru.resolutionpoint.edu.animals.model.Entity entity) {
    for (ru.resolutionpoint.edu.animals.view.EntityView en : ru.resolutionpoint.edu.animals.view.EntitiesPanel.entities) {
        if (en.getEntity().equals(entity)) {
            ru.resolutionpoint.edu.animals.view.EntitiesPanel.entities.remove(en);
            java.lang.System.out.print(((("delete" + (entity.getX())) + " ") + (entity.getY())));
            break;
        }
    }
}