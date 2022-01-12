private static com.archimatetool.model.IDiagramModel getModelFromFile() {
    com.archimatetool.model.IDiagramModel diagramModel = null;
    try {
        java.util.List<com.archimatetool.model.IDiagramModel> iDModels = ((mainCls.getArchiModelFromFile()) != null) ? mainCls.getArchiModelFromFile().getDiagramModels() : null;
        if (iDModels != null) {
            java.lang.System.out.println(("Size of iDModels --------------------- " + (iDModels.size())));
            diagramModel = iDModels.get(3);
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return diagramModel;
}