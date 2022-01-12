private java.util.List<ru.sidvi.depextractor.model.JarInfo> processJarItems(ru.sidvi.depextractor.extractors.InfoExtractorFacade.Jar jar, java.util.jar.JarEntry file) {
    java.util.List<ru.sidvi.depextractor.model.JarInfo> extracted = new java.util.ArrayList<>();
    for (ru.sidvi.depextractor.extractors.pathcomparators.PathComparator comparator : ru.sidvi.depextractor.extractors.ExtractorsFactory.getRegisteredComparators()) {
        if (comparator.isValid(file.getName())) {
            extracted.addAll(tryToExtract(jar, file, comparator));
        }
    }
    return extracted;
}