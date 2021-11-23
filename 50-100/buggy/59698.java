public static void removeMarker(org.eclipse.core.resources.IMarker marker) {
    eu.modelwriter.configuration.internal.AlloyUtilities.removeAllRelationsOfMarker(marker);
    eu.modelwriter.configuration.internal.AlloyUtilities.removeTypeFromMarker(marker);
    eu.modelwriter.traceability.core.persistence.DocumentRoot documentRoot = eu.modelwriter.configuration.internal.AlloyUtilities.getDocumentRoot();
    int itemTypeIndex = eu.modelwriter.configuration.internal.AlloyUtilities.findItemTypeInRepository(marker);
    if (itemTypeIndex == (-1))
        return ;
    
    documentRoot.getAlloy().getRepository().getItem().remove(itemTypeIndex);
    eu.modelwriter.configuration.internal.AlloyUtilities.writeDocumentRoot(documentRoot);
}