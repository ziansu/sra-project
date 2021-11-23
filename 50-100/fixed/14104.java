public void displaySubmitManuscriptMenu() {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    printHeader();
    java.lang.System.out.println("\nPlease enter the complete pathname for the Manuscript to be submitted: ");
    java.lang.String filename = scanner.nextLine();
    scanner.close();
    try {
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Invalid pathname. File could not be found.");
        java.lang.System.out.println();
        displayMainMenu();
    }
    java.lang.System.out.println("Manuscript submitted successfully.");
    java.lang.System.out.println();
    displayMainMenu();
}