private static java.lang.String scanPassword() throws java.lang.IllegalArgumentException {
    java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.print("Input password: ");
    java.lang.String password;
    if (sc.hasNext()) {
        password = sc.nextLine();
    }else {
        throw new java.lang.IllegalArgumentException("Invalid password value");
    }
    return password;
}