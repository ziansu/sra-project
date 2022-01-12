public static void main(java.lang.String[] args) {
    test.Main.manager.registerCommands(new test.TestingCommands());
    while (true) {
        java.lang.System.out.print("> ");
        java.lang.String text = test.Main.scanner.nextLine();
        net.ddns.endercrypt.intellicommand.bundle.Bundle bundle = new net.ddns.endercrypt.intellicommand.bundle.Bundle();
        bundle.add("POINT", new java.awt.Point(5, 5));
        try {
            test.Main.manager.trigger(bundle, text);
        } catch (net.ddns.endercrypt.intellicommand.exception.IntelliCommandNotFound e) {
            java.lang.System.err.println("Command not found");
        }
    } 
}