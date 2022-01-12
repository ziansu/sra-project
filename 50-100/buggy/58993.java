public static void main(java.lang.String[] args) {
    logic.TextUI.sc = new java.util.Scanner(java.lang.System.in);
    logic.ExecutedCommands.initialize();
    while (true) {
        java.lang.String input = logic.TextUI.sc.nextLine();
        logic.Command command = Parser.CommandParser.parseInput(input);
        logic.Response response = logic.TaskProcessor.executeCommand(command);
        logic.TextUI.displayResponse(response);
    } 
}