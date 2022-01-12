private static java.util.List<java.lang.String> addEntry(tinypass.EncryptResult desResult, tinypass.EncryptResult passResult, java.lang.String name) {
    java.util.List<java.lang.String> data = tinypass.Cli.readData();
    java.lang.String line = java.lang.String.join("|", toStringBase64(name), tinypass.Cli.convertToString(desResult), tinypass.Cli.convertToString(passResult));
    data.add(line);
    return data;
}