@java.lang.Override
public void invoke(java.util.List<java.lang.String> args) {
    for (java.lang.String token : args) {
        final java.lang.String name = token;
        if ((name.length()) > 0) {
            final codeu.chat.client.core.UserContext foundUser = findUser(name);
            if (foundUser == null) {
                java.lang.System.out.format("ERROR: No user with name \'%s\'\n", name);
            }else {
                java.lang.System.out.format("User \'%s\' removed from interests. \n", name);
                user.removeUserInterest(name);
            }
        }else {
            java.lang.System.out.println("ERROR: Missing <username>");
        }
    }
}