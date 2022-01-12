public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Welcome to TextExcel!\n");
    java.lang.System.out.println("Enter a command: ");
    Excel.Spreadsheet sheet = new Excel.Spreadsheet();
    java.util.Scanner userInput = new java.util.Scanner(java.lang.System.in);
    java.lang.String input = userInput.nextLine();
    while (!(input.equalsIgnoreCase("exit"))) {
        sheet.processCommand(input);
        java.lang.System.out.println();
        java.lang.System.out.println("Enter a command: ");
        input = userInput.nextLine();
    } 
    java.lang.System.out.println("Farewell!");
    userInput.close();
}