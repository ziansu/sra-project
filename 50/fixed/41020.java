@java.lang.Override
public com.fallingdutchman.youtuberedditbot.formatting.Formatter createFormatterFromFile(java.io.File file) throws java.io.IOException {
    return new com.fallingdutchman.youtuberedditbot.formatting.Formatter(com.fallingdutchman.youtuberedditbot.formatting.FileFormatterFactory.joinStrings(java.nio.file.Files.readAllLines(java.nio.file.Paths.get(file.toURI()))));
}