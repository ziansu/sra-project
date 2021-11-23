public void registerUser(java.lang.String username, java.lang.String name, java.lang.String lastname, java.lang.String password) {
    hska.iwi.eShopMaster.model.database.dataobjects.User user = new hska.iwi.eShopMaster.model.database.dataobjects.User();
    user.setFirstname(name);
    user.setName(lastname);
    user.setUsername(username);
    user.setPassword(password);
    hska.iwi.eShopMaster.model.database.dataobjects.Role role = new hska.iwi.eShopMaster.model.database.dataobjects.Role(2, "user", 1);
    user.setRole(role);
    user.setLevel(role.getLevel());
    helper.saveUser(user);
}