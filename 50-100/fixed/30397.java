public java.lang.String[] handlerCreateGame(java.lang.String user) throws java.lang.Exception {
    java.lang.System.out.println(("CreateGameHandler received " + user));
    java.lang.String[] returned = LogicServer.User.UserCreateGame(user, mysocket, ServerCommunication.ServerProtocol.chat);
    int id = java.lang.Integer.parseInt(returned[1]);
    LogicServer.User.setSocketPlayer1(mysocket, id);
    ServerCommunication.ServerProtocol.chat.newGame(user);
    java.lang.String[] toReturn = new java.lang.String[]{ "CreateGame" , returned[0] , returned[1] };
    java.lang.System.out.println("Server created game");
    return toReturn;
}