public static void main(java.lang.String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    Controller controller = new Controller();
    Veto.showLine(controller.getWelcomeMessage());
    while (!(controller.isTimeToExit())) {
        Veto.show(Veto.MESSAGE_COMMAND_PROMPT);
        java.lang.String userInput = scanner.nextLine();
        java.lang.String feedback = controller.executeCommand(userInput);
        Veto.showLine(feedback);
    } 
    scanner.close();
}