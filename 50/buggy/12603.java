@java.lang.Override
public char[] getPassword() {
    java.io.Console console = java.lang.System.console();
    if (console == null) {
        return "".toCharArray();
    }
    char[] password = console.readPassword("Password: ");
    return password;
}