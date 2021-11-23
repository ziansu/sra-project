public java.util.List<models.User> getMembers() {
    java.util.List<models.User> users = new java.util.ArrayList<models.User>();
    if ((this.members) == null)
        return users;
    
    long[] list = this.getMembersList();
    for (int i = 0; i < (list.length); i++) {
        users.add(User.find.byId(list[i]));
    }
    return users;
}