public void createUser(java.lang.String userNick, java.lang.String userEmail) throws es.upm.miw.apaw.p2.sport.exceptions.InvalidUserEmailException, es.upm.miw.apaw.p2.sport.exceptions.InvalidUserNickException {
    this.validateUserNick(userNick);
    this.validateUserEmail(userEmail);
    new es.upm.miw.apaw.p2.sport.controllers.UserController().createUser(userNick, userEmail);
}