public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Bag Pandekager-app\n");
    Main.initialInfo();
    Main.cookPancakes();
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.String input = scanner.nextLine();
    java.lang.System.out.println("Er du meget sulten (j/n)?");
    if (input.toLowerCase().startsWith("j")) {
        java.lang.System.out.println("Spis det hele selv!");
    }else
        if (input.toLowerCase().startsWith("n")) {
            java.lang.System.out.println("Invitér naboerne til spisning!");
        }
    
}