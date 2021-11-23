public java.lang.Boolean autorAussendienst() {
    if (((securityService) == null) || (!(autorIntern()))) {
        return false;
    }
    de.fraunhofer.igd.klarschiff.service.security.User user = securityService.getUserByEmail(this.autorEmail);
    if (user == null) {
        return false;
    }
    return !(user.getAussendienstTeams().isEmpty());
}