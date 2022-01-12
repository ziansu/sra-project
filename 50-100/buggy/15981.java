public fr.epita.iam.datamodel.User authenticate(java.lang.String login, java.lang.String pass) {
    fr.epita.iam.services.AuthenticationDataService.LOGGER.info(" => Authenticate with params : {}, {}", login, pass);
    fr.epita.iam.datamodel.User result;
    result = uDao.search(new fr.epita.iam.datamodel.User(login, pass, null)).get(0);
    return result;
}