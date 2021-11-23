private org.eclipse.sirius.diagram.description.Layer getOrCreateAnimationLayer(org.eclipse.sirius.diagram.description.DiagramDescription description, java.lang.String layerName, org.eclipse.core.runtime.IProgressMonitor monitor) {
    final org.eclipse.sirius.diagram.description.Layer res;
    org.eclipse.sirius.diagram.description.Layer existingLayer = null;
    for (org.eclipse.sirius.diagram.description.Layer layer : description.getAdditionalLayers()) {
        if ("Animation".equals(layer.getName())) {
            existingLayer = layer;
            break;
        }
    }
    if (existingLayer != null) {
        res = existingLayer;
    }else {
        res = org.modelexecution.xmof.gemoc.extension.sirius.ui.command.AddAnimationLayerRunnable.createLayer(description, layerName, monitor);
    }
    return res;
}