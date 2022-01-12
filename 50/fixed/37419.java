private static void returnMenu() {
    java.lang.String title;
    java.lang.System.out.print("Book title: ");
    Library.scanner.nextLine();
    title = Library.scanner.nextLine();
    java.lang.System.out.println((("You returned " + title) + ". Thank you."));
}