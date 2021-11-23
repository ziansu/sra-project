public void load(java.io.File file) throws at.pcgamingfreaks.yaml.YAMLInvalidContentException, java.io.IOException {
    try (java.io.FileInputStream inputStream = new java.io.FileInputStream(file)) {
        load(inputStream);
    }
}