private static void help(java.io.PrintStream out) {
    out.println("Available commands:");
    out.println("help             - Display this message.");
    out.println("info             - Display informations about server.");
    out.println("shutdown         - Stop server after all current task.");
    out.println("shutdownnow      - Stop server.");
    out.println("loadtasks <file> - Add tasks description to server.");
}