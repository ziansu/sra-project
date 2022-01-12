@java.lang.Override
public synchronized void join(com.lucwo.fourcharm.server.ClientHandler client, java.lang.String pName, int gNumber, java.util.Set<nl.woutertimmermans.connect4.protocol.parameters.Extension> exts) throws nl.woutertimmermans.connect4.protocol.exceptions.C4Exception {
    if (getServer().hasClientWithName(pName)) {
        throw new nl.woutertimmermans.connect4.protocol.exceptions.InvalidUsernameError((("The username " + pName) + " is already in use"));
    }else {
        client.setName(pName);
        client.registerExtensions(exts);
        client.getCoreClient().accept(com.lucwo.fourcharm.server.PreLobbyGroup.LUCWO_GROUP_NUMBER, extensions);
        lobby.addHandler(client);
    }
}