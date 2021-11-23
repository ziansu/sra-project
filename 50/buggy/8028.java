public static java.lang.String getInput() {
    java.lang.System.out.println("Please Enter An Input Below:");
    Menu.scan = new java.util.Scanner(java.lang.System.in);
    java.lang.String input = Menu.scan.nextLine().toLowerCase().replaceAll("\\s+", "");
    return input;
}