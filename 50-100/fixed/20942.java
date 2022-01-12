public static void main(java.lang.String[] args) {
    java.lang.String s = null;
    java.util.Scanner reader = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Hello World!");
    java.lang.System.out.println("What is your name?");
    s = reader.nextLine();
    if ((s == null) || ((s.isEmpty()) == true)) {
    }else {
        java.lang.System.out.println((("Hello, " + s) + "."));
    }
}