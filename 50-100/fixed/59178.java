public java.lang.String getLibraryVersion(org.opentravel.schemas.node.LibraryNode lib) {
    java.lang.String version = "";
    org.opentravel.schemas.node.NamespaceHandler nsHandler = null;
    if (lib != null) {
        nsHandler = lib.getNsHandler();
        org.opentravel.schemacompiler.repository.ProjectItem projectItem = lib.getProjectItem();
        if (((projectItem != null) && (nsHandler != null)) && (!(RepositoryItemState.UNMANAGED.equals(projectItem.getState())))) {
            version = nsHandler.getNSVersion(lib.getNamespace());
        }
    }
    return version;
}