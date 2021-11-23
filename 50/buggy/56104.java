@java.lang.Override
public void initializeGraphicalViewer() {
    super.initializeGraphicalViewer();
    idees.gama.features.modelgeneration.ModelGenerator.modelValidation(getDiagramTypeProvider().getFeatureProvider(), getDiagram());
    doSave(null);
}