@java.lang.Override
public java.lang.String getInput() {
    scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.String catched = scanner.nextLine();
    if (catched.equals("quit")) {
        endProgram();
    }
    return catched;
}