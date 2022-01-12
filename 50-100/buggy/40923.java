public static void conceptIdsToTextFile(java.util.Collection<java.lang.String> conceptIds, java.lang.String destinationFilepath) throws java.lang.Exception {
    java.nio.file.Path path = java.nio.file.Paths.get(destinationFilepath);
    java.util.List<java.lang.String> conceptsOut = new java.util.ArrayList<>();
    for (java.lang.String concept : conceptIds) {
        conceptsOut.add((("\"" + concept) + "\""));
    }
    java.nio.file.Files.write(path, conceptsOut, java.nio.charset.StandardCharsets.UTF_8);
}