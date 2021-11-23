public mcknighte.entity.Client editClient(mcknighte.entity.Client client, java.lang.String providedPassword) throws mcknighte.exception.UserDoesNotExistException, mcknighte.exception.UserIncorrectPasswordException {
    if ((this.checkLogin(client.getUsername(), providedPassword)) != null) {
        cF.edit(client);
    }else {
        throw new mcknighte.exception.UserIncorrectPasswordException(client);
    }
    return client;
}