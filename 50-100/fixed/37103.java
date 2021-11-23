private static void addEntry(java.util.List<java.lang.String> data, tinypass.EncryptResult desResult, tinypass.EncryptResult passResult, java.lang.String name) {
    java.lang.String line = java.lang.String.join("|", toStringBase64(name), tinypass.Cli.convertToString(desResult), tinypass.Cli.convertToString(passResult));
    data.add(line);
}