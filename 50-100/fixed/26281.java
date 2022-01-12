public static void intro() {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Is this your first time playing? [Y/N]");
    java.lang.String answer = scanner.nextLine();
    if (answer.equalsIgnoreCase("y")) {
        Player.first = true;
        Player.prologue();
    }
    java.lang.System.out.println("Hello traveler, what is your name?");
    java.lang.String name = scanner.nextLine();
    java.lang.System.out.println((("Welcome " + name) + ", let us begin your adventure"));
    java.lang.System.out.println("First we must create your character");
}