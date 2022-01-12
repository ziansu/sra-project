@java.lang.Override
public char[] getPassword() throws java.io.IOException {
    char[] password = new char[0];
    java.lang.System.out.print("Password: ");
    final jline.console.ConsoleReader reader = new jline.console.ConsoleReader();
    java.lang.String passwordStr = reader.readLine('*');
    password = passwordStr.toCharArray();
    passwordStr = null;
    java.lang.System.gc();
    return password;
}