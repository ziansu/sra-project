@java.lang.Override
public void invoke(java.util.Scanner args) {
    final java.lang.String name = (args.hasNext()) ? args.nextLine().trim() : "";
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