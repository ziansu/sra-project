public void displaySubmitManuscriptMenu() {
    java.lang.String filename = "";
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    printHeader();
    java.lang.System.out.println("\nPlease enter the complete pathname for the Manuscript to be submitted: ");
    filename = scanner.nextLine();
    scanner.close();
    try {
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Invalid pathname. File could not be found.");
        displayMainMenu();
    }
    java.lang.System.out.println("Manuscript submitted successfully.");
    displayMainMenu();
}