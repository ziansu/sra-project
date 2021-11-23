public void newGroup(java.lang.String name, java.util.ArrayList<java.lang.String> usernames) {
    java.util.ArrayList<client.User> users = new java.util.ArrayList<client.User>(usernames.size());
    for (java.lang.String S : usernames)
        users.add(new client.User(S, getIP(S)));
    
    groups.add(new client.Group(name, users));
}