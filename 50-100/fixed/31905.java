public synchronized data.User createNewUser(@javax.validation.constraints.NotNull
java.lang.String name, java.lang.String surname, data.User.CountryName countryName, @javax.validation.constraints.NotNull
java.lang.String email) {
    data.User user = new data.User();
    user.setName(name);
    user.setSurname(surname);
    user.setCountry(countryName);
    user.setEmail(email);
    em.persist(user);
    return user;
}