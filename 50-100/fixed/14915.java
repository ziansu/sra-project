public static final org.iocaste.documents.common.ExtendedObject createGroup(java.lang.String name, org.iocaste.packagetool.services.State state) {
    org.iocaste.documents.common.DocumentModel model = state.documents.getModel("TASKS_GROUPS");
    org.iocaste.documents.common.ExtendedObject object = new org.iocaste.documents.common.ExtendedObject(model);
    object.set("NAME", name);
    state.documents.save(object);
    return object;
}