public static java.lang.String extractUserIdFromVault(java.lang.String userName, java.lang.String password, java.lang.String idPath, java.lang.String serverName) {
    return com.mindoo.domino.jna.utils.IDUtils._getUserIdFromVault(userName, password, idPath, null, serverName);
}