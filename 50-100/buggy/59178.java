public java.lang.String getLibraryVersion(org.opentravel.schemas.node.LibraryNode lib) {
    org.opentravel.schemas.node.NamespaceHandler nsHandler = lib.getNsHandler();
    org.opentravel.schemacompiler.repository.ProjectItem projectItem = lib.getProjectItem();
    java.lang.String version = "";
    if (((projectItem != null) && (nsHandler != null)) && (!(RepositoryItemState.UNMANAGED.equals(projectItem.getState())))) {
        version = nsHandler.getNSVersion(lib.getNamespace());
    }
    return version;
}