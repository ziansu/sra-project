@controllers.Check(value = "any")
public static void open(java.lang.Long id) {
    models.Project entity = models.Project.findById(id);
    notFoundIfNull(entity);
    entity.isOpen = true;
    entity.save();
    flash.success(play.i18n.Messages.get("scaffold.updated", "Project"));
    controllers.Projects.show(id);
}