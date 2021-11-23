private static void borrowMenu() {
    java.lang.String title;
    java.lang.System.out.print("Book title: ");
    Main.scan.nextLine();
    title = Main.scan.nextLine();
    java.lang.System.out.println(Main.user);
    Main.user.borrowBook(Main.lib, title);
    java.lang.System.out.println((("You borrowed " + title) + "."));
}