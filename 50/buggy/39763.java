public static void main(java.lang.String... args) throws com.db.edu.chat.server.ServerError {
    try {
        new com.db.edu.chat.server.Server().start();
    } catch (java.io.IOException e) {
        com.db.edu.chat.server.Server.logger.error("Couldn't initialize properties: ", e);
    }
}