private com.intellij.openapi.roots.libraries.Library getIvyIdeaLibrary(com.intellij.openapi.roots.ModifiableRootModel modifiableRootModel, final java.lang.String libraryName) {
    final com.intellij.openapi.roots.libraries.LibraryTable libraryTable = modifiableRootModel.getModuleLibraryTable();
    final com.intellij.openapi.roots.libraries.Library library = libraryTable.getLibraryByName(libraryName);
    if (library == null) {
        org.clarent.ivyidea.intellij.model.LibraryModels.LOGGER.info((((("Internal library not found for module " + (modifiableRootModel.getModule().getModuleFilePath())) + ", creating with name ") + libraryName) + "..."));
        return libraryTable.createLibrary(libraryName);
    }
    return library;
}