public java.util.List<models.User> getMembers() {
    java.util.List<models.User> users = new java.util.ArrayList<models.User>();
    if ((this.members) == null)
        return users;
    
    java.util.List<java.lang.Long> list = this.getMembersList();
    for (int i = 0; i < (list.size()); i++) {
        users.add(User.find.byId(list.get(i)));
    }
    return users;
}