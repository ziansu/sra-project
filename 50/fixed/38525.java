@java.lang.Override
public void joinGame(int id, shared.definitions.CatanColor color) throws client.networking.ServerProxyException {
    if (!(userLoggedIn)) {
        throw new client.networking.ServerProxyException("JoinGame invalid when user not logged in");
    }
}