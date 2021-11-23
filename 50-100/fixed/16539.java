public void removeDependency(com.intellij.openapi.roots.OrderRootType type, java.lang.String dependencyUrl) {
    org.clarent.ivyidea.intellij.model.LibraryModels.LOGGER.info(((("Removing no longer needed dependency of type " + type) + ": ") + dependencyUrl));
    for (com.intellij.openapi.roots.libraries.Library.ModifiableModel libraryModel : libraryModels.values()) {
        libraryModel.removeRoot(dependencyUrl, type);
    }
}