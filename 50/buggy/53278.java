public java.lang.String readArgumentEmail() {
    java.lang.String argument = "";
    do {
        java.lang.System.out.printf("Choose a email address: ");
        argument = keyboardSc.next();
    } while (argument == "" );
    return argument;
}