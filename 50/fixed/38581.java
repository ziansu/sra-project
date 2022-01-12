@java.lang.Override
public de.xikolo.models.Module get(java.lang.String id) {
    de.xikolo.models.Module module = super.get(id);
    if (module != null) {
        module.progress = progressDataAccess.get(id);
    }
    return module;
}