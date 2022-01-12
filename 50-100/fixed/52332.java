public static boolean addUserToGroup(user.User requestor, java.lang.String username, java.lang.String groupname) throws exceptions.GroupDoesNotExistException, exceptions.SessionExpiredException, exceptions.UserDoesNotExistException {
    server_client.RequestHandler.validate(requestor);
    synchronized(server_client.RequestHandler.ADD_DB_LOCK) {
        if (server_client.RequestHandler.dbm.addUserToGroup(username, groupname)) {
            server_client.RequestHandler.notify(username, 1, ("You have been added to the group " + groupname));
            return true;
        }else {
            return false;
        }
    }
}