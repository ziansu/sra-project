public java.lang.String registerUser(java.lang.String firstName, java.lang.String lastName, java.lang.String email, java.lang.String password, java.lang.String passwordConfirmation) {
    try {
        gppmds.wikilegis.model.User user = new gppmds.wikilegis.model.User(firstName, lastName, email, password, passwordConfirmation);
        return "SUCESS";
    } catch (gppmds.wikilegis.exception.UserException e) {
        java.lang.String exceptionMessage = e.getMessage();
        return exceptionMessage;
    } catch (java.io.IOException e) {
        return "IOException";
    }
}