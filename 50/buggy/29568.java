public de.greenrobot.daogenerator.ContentProvider addContentProvider() {
    java.util.List<de.greenrobot.daogenerator.Entity> entities = new java.util.ArrayList<de.greenrobot.daogenerator.Entity>();
    de.greenrobot.daogenerator.ContentProvider contentProvider = new de.greenrobot.daogenerator.ContentProvider(schema, entities);
    contentProviders.add(contentProvider);
    return contentProvider;
}