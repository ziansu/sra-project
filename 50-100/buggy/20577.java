public static play.mvc.Result moveModule(int moduleId, int to) {
    models.Module module = Module.find.byId(moduleId);
    if ((module != null) && ((module.page) != to)) {
        module.setPage(to);
        module.setModuleOrder(0);
        module.setSize(12);
        module.save();
        controllers.Application.modules = Module.find.all();
        controllers.Application.ws.moduleListChanged();
    }else {
        return notFound();
    }
    return ok();
}