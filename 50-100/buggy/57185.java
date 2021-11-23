public void createView(java.lang.String id, java.lang.String mimeType, java.lang.String name, java.lang.String template, uk.ac.open.kmi.basil.view.Engine engine) throws java.io.IOException {
    uk.ac.open.kmi.basil.view.Views views = data.loadViews(id);
    views.put(name, name, template, engine);
    data.saveViews(id, views);
}