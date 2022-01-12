@java.lang.Override
public void invoke(java.util.List<java.lang.String> args) {
    final java.lang.String name = args.get(0);
    args.remove(0);
    if ((name.length()) > 0) {
        if ((context.create(name)) == null) {
            java.lang.System.out.println("ERROR: Failed to create new user");
        }
    }else {
        java.lang.System.out.println("ERROR: Missing <username>");
    }
}