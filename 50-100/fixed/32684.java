@java.lang.Override
public void invoke(java.util.List<java.lang.String> args) {
    final java.lang.String name = args.get(0);
    args.remove(0);
    if ((name.length()) > 0) {
        final codeu.chat.client.core.UserContext user = findUser(name);
        if (user == null) {
            java.lang.System.out.format("ERROR: Failed to sign in as \'%s\'\n", name);
        }else {
            panels.push(createUserPanel(user));
        }
    }else {
        java.lang.System.out.println("ERROR: Missing <username>");
    }
}