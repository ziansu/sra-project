@java.lang.Override
public com.example.mm.model.User updateUser(java.lang.Long id, java.lang.String firstname, java.lang.String lastname, java.lang.String email, java.lang.String password) {
    com.example.mm.model.User user = userRepositoryCrud.findOne(id);
    user.id = id;
    user.firstName = firstname;
    user.lastName = lastname;
    user.email = email;
    user.password = password;
    user = userRepositoryCrud.save(user);
    return user;
}