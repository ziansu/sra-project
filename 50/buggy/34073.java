@java.lang.Override
public void deleteUserById(java.lang.Integer id) {
    for (rest.model.User user : rest.service.impl.UserServiceImpl.users) {
        if (id == (user.getId())) {
            rest.service.impl.UserServiceImpl.users.remove(id);
        }
    }
}