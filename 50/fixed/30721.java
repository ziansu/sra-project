public se.jeli.model.LoginUser findUser(java.lang.String userName) {
    java.util.List<se.jeli.model.LoginUser> findByName = repository.findByName(userName);
    if (findByName.isEmpty()) {
        return null;
    }
    return findByName.get(0);
}