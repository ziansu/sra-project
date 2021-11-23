public static java.lang.String askFor(java.lang.String prompt) {
    java.lang.String result = null;
    java.lang.System.out.print((prompt + ": "));
    if ((java.lang.System.console()) == null) {
        result = new java.util.Scanner(java.lang.System.in).nextLine();
    }else {
        result = java.lang.System.console().readLine();
    }
    return result;
}