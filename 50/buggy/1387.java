public java.lang.String deleteUser(beans.User u) {
    services.impl.UserServiceImplMemory.users.remove(id);
    return "success";
}