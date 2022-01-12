public void delPlayer(java.lang.String user) {
    users.remove(user.toLowerCase());
    users.remove(user);
    myTribe.put("members", users);
    japura.Tribes.Tribes.getTribeTable().save(myTribe);
}