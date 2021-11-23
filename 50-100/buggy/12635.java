@java.lang.Override
public void invoke(java.util.Scanner args) {
    final java.lang.String name = (args.hasNext()) ? args.nextLine().trim() : "";
    if ((name.length()) > 0) {
        if ((context.create(name)) == null) {
            java.lang.System.out.println("ERROR: Failed to create new user");
        }
    }else {
        java.lang.System.out.println("ERROR: Missing <username>");
    }
}