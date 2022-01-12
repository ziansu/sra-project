public java.lang.Object decode(java.lang.String toDecode) throws java.io.InterruptedIOException, java.lang.NullPointerException {
    com.google.gson.JsonParser parser = new com.google.gson.JsonParser();
    if (toDecode == null) {
        throw new java.io.InterruptedIOException("Errore");
    }
    java.lang.System.out.println(toDecode);
    java.lang.String method = parser.parse(toDecode).getAsJsonObject().get("methodInvoked").getAsString();
    if (commands.containsKey(method)) {
        return commands.get(method).execute(toDecode);
    }else {
        throw new java.lang.IllegalArgumentException("Comunicazione sconosciuta!");
    }
}