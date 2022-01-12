static java.nio.file.Path convertFromActualToModulePath(org.terasology.module.filesystem.ModuleFileSystem fileSystem, java.nio.file.Path root, java.nio.file.Path actualPath) throws java.io.IOException {
    java.nio.file.Path actualRealPath = actualPath.toRealPath();
    java.nio.file.Path relative = root.relativize(actualRealPath);
    java.util.List<java.lang.String> pathParts = com.google.common.collect.Lists.newArrayListWithCapacity(((relative.getNameCount()) + 1));
    pathParts.add(ModuleFileSystemProvider.SEPARATOR);
    for (java.nio.file.Path part : relative) {
        pathParts.add(part.toString());
    }
    return org.terasology.module.filesystem.ModulePath.newPathFromParts(fileSystem, pathParts);
}