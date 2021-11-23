@java.lang.Override
public java.util.List<oracle.academy.model.User> getAll() {
    java.util.List<oracle.academy.model.User> users = new java.util.ArrayList<>();
    for (int i = 0; i < (oracle.academy.UserDaoImpl.usersMap.size()); i++) {
        users.add(oracle.academy.UserDaoImpl.usersMap.get(i));
    }
    return users;
}