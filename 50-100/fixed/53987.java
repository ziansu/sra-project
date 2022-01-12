private java.util.List<java.lang.String> getSortedDependentCategories(java.util.Set<java.lang.String> originalCategories, com.day.cq.widget.LibraryType type, java.util.List<java.lang.String> existingCategories) {
    final java.util.Collection<com.day.cq.widget.ClientLibrary> libraries = htmlLibraryManager.getLibraries(originalCategories.toArray(new java.lang.String[0]), null, true, false);
    return com.adobe.acs.tools.clientlib_optimizer.impl.ClientLibOptimizerServlet.getSortedDependentCategories(libraries, originalCategories, type, existingCategories);
}