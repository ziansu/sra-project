public java.lang.String getStringInput() throws java.lang.Exception {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.System.in.skip(java.lang.System.in.available());
    java.lang.String returnable;
    returnable = scanner.nextLine();
    return returnable;
}