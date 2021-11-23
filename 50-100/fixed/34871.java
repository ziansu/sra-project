@java.lang.Override
public com.example.mm.model.User updateUser(java.lang.Long id, java.lang.String firstname, java.lang.String lastname, java.lang.String email, java.lang.String password) {
    com.example.mm.model.User user = userRepositoryCrud.findOne(id);
    if (id != null)
        user.id = id;
    
    if (firstname != null)
        user.firstName = firstname;
    
    if (lastname != null)
        user.lastName = lastname;
    
    if (email != null)
        user.email = email;
    
    if (password != null)
        user.password = password;
    
    return userRepositoryCrud.save(user);
}