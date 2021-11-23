static void writeClient(java.lang.String name, java.lang.String value) {
    try (java.io.FileWriter fw = new java.io.FileWriter((((ChatBot.Logger.clientsPath) + name) + (ChatBot.Logger.EXT)), false)) {
        fw.write(value);
    } catch (java.io.IOException e) {
        ChatBot.Logger.logException(e);
    }
}