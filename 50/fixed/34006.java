public com.sherlockHomies.beans.User getUserById(int id) {
    com.sherlockHomies.beans.User user = context.getBean(com.sherlockHomies.orm.Facade.class).getUser(id);
    if (user == null) {
        java.lang.System.out.println("User not found");
        return null;
    }
    return user;
}