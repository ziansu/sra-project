public java.lang.String UpdateUser(beans.User u) {
    java.lang.Long id = u.getId();
    beans.User u = services.impl.UserServiceImplMemory.users.get(id);
    u.setName(user.getName());
    u.setAge(user.getAge());
    services.impl.UserServiceImplMemory.users.put(id, u);
    return "success";
}