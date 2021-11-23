public static void sendJSONMessage(java.lang.String message, java.lang.String... args) {
    JSONObject response = new JSONObject();
    for (int i = 0; i < ((args.length) - 1); i += 2) {
        response.put(args[i], args[(i + 1)]);
    }
    java.lang.System.out.println(message);
    Lobby.server.SendMessage(message, response);
}