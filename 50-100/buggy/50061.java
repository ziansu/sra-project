public static void readVIZ(java.nio.file.Path path, be.samey.model.Model model) {
    org.cytoscape.task.read.LoadVizmapFileTaskFactory loadVizmapFileTaskFactory = model.getServices().getLoadVizmapFileTaskFactory();
    org.cytoscape.view.vizmap.VisualMappingManager visualMappingManager = model.getServices().getVisualMappingManager();
    java.io.File file = path.toFile();
    java.util.Set<org.cytoscape.view.vizmap.VisualStyle> vsSet = loadVizmapFileTaskFactory.loadStyles(file);
    for (org.cytoscape.view.vizmap.VisualStyle vs : vsSet) {
        visualMappingManager.addVisualStyle(vs);
    }
}