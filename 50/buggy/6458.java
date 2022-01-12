public java.lang.Boolean createPerson(java.lang.String username, java.lang.String email, java.lang.String name, java.lang.String password, java.lang.String surname) {
    return registerLoginDAO.register(name, surname, email, username, password);
}