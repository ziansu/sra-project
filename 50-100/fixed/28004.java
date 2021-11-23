private java.util.Collection<com.spinn3r.artemis.resource_finder.references.ResourceReference> findResources(java.io.File file, java.util.regex.Pattern pattern) throws java.io.IOException {
    java.util.List<com.spinn3r.artemis.resource_finder.references.ResourceReference> result = new java.util.ArrayList<>();
    if (file.isDirectory()) {
        result.addAll(findResourcesFromDirectory(file, pattern));
    }else {
        result.addAll(findResourcesFromJarFile(file, pattern));
    }
    return result;
}