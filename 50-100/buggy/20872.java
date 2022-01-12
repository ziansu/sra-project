public static eu.modelwriter.traceability.core.persistence.DocumentRoot getDocumentRoot() {
    @java.lang.SuppressWarnings(value = "rawtypes")
    eu.modelwriter.configuration.internal.ModelIO modelIO = new eu.modelwriter.configuration.internal.ModelIO();
    @java.lang.SuppressWarnings(value = "rawtypes")
    java.util.List list = modelIO.read(eu.modelwriter.configuration.internal.AlloyUtilities.getUri());
    if (list.isEmpty())
        return null;
    
    eu.modelwriter.traceability.core.persistence.DocumentRoot documentRoot = ((eu.modelwriter.traceability.core.persistence.DocumentRoot) (list.get(0)));
    return documentRoot;
}