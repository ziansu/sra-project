public java.lang.String deleteUser(java.lang.Long id) {
    services.impl.UserServiceImplMemory.users.remove(id);
    return "success";
}