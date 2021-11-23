@java.lang.Override
public server.enums.ResponseType analyze(server.Client client, java.lang.String[] splittedUserInput) {
    if (server.Database.isUserStandingAtleast(client.getUsername(), UserStanding.MOD)) {
        java.lang.String targetUsername = splittedUserInput[1];
        if (server.Database.doesUserExist(targetUsername)) {
            server.Database.setUserStanding(targetUsername, UserStanding.NORMAL);
            return server.enums.ResponseType.GENERAL_SUCCESS;
        }else {
            return server.enums.ResponseType.USER_DOES_NOT_EXIST;
        }
    }else {
        return server.enums.ResponseType.NOT_ALLOWED;
    }
}