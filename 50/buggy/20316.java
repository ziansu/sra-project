public void initialize() {
    users = everythingElse.User.loadUsers();
    java.lang.System.out.println(users.getHashMap());
    Output.setEditable(false);
}