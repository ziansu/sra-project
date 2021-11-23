public static java.util.Set<org.cytoscape.view.vizmap.VisualStyle> readVIZ(java.nio.file.Path path, be.samey.model.Model model) {
    java.io.File file = path.toFile();
    org.cytoscape.task.read.LoadVizmapFileTaskFactory loadVizmapFileTaskFactory = model.getServices().getLoadVizmapFileTaskFactory();
    java.util.Set<org.cytoscape.view.vizmap.VisualStyle> vsSet = loadVizmapFileTaskFactory.loadStyles(file);
    return vsSet;
}