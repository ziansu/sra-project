public java.lang.String UpdateUser(beans.User user) {
    java.lang.Long id = user.getId();
    beans.User u = services.impl.UserServiceImplMemory.users.get(id);
    u.setName(user.getName());
    u.setAge(user.getAge());
    services.impl.UserServiceImplMemory.users.put(id, u);
    return "success";
}