public void removeDependency(com.intellij.openapi.roots.OrderRootType type, com.intellij.openapi.vfs.VirtualFile virtualFile) {
    final java.lang.String dependencyUrl = virtualFile.getUrl();
    org.clarent.ivyidea.intellij.model.LibraryModels.LOGGER.info(((("Removing no longer needed dependency of type " + type) + ": ") + dependencyUrl));
    for (com.intellij.openapi.roots.libraries.Library.ModifiableModel libraryModel : libraryModels.values()) {
        libraryModel.removeRoot(dependencyUrl, type);
    }
}