public fr.epita.iam.datamodel.User authenticate(java.lang.String login, java.lang.String pass) {
    fr.epita.iam.services.AuthenticationDataService.LOGGER.info(" => Authenticate with params : {}, {}", login, pass);
    java.util.List<fr.epita.iam.datamodel.User> result = uDao.search(new fr.epita.iam.datamodel.User(login, pass, null));
    if (!(result.isEmpty())) {
        return result.get(0);
    }
    return null;
}