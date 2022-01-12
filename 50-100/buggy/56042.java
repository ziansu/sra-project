@java.lang.Override
public server.enums.ResponseType analyze(server.Client client, java.lang.String[] splittedUserInput) {
    if ((server.Database.getUserStanding(client.getUsername())) == (server.enums.UserStanding.ADMIN)) {
        java.lang.String targetUsername = splittedUserInput[1];
        if (server.Database.doesUserExist(targetUsername)) {
            server.Database.setUserStanding(targetUsername, UserStanding.MOD);
            client.setUserStanding(UserStanding.MOD);
            return server.enums.ResponseType.GENERAL_SUCCESS;
        }else {
            return server.enums.ResponseType.USER_DOES_NOT_EXIST;
        }
    }else {
        return server.enums.ResponseType.NOT_ALLOWED;
    }
}