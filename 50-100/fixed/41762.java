static void saveIntVar(java.lang.String name, int value) {
    try (java.io.FileWriter fw = new java.io.FileWriter((((ChatBot.Logger.varsPath) + name) + (ChatBot.Logger.EXT)), false)) {
        fw.write(java.lang.Integer.toString(value));
    } catch (java.io.IOException e) {
        ChatBot.Logger.logException(e);
    }
}