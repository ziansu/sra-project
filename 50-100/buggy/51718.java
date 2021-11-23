public java.util.ArrayList<main.java.logic.Task> handleUserCommand(java.lang.String userInput, java.util.ArrayList<main.java.logic.Task> taskOptions) throws java.lang.Exception {
    assert userInput != null;
    main.java.logic.CommandDispatcher dispatcher = new main.java.logic.CommandDispatcher();
    main.java.logic.Command command = new main.java.logic.Command(userInput);
    command = parseCommand(dispatcher, command);
    java.lang.System.out.println(retrieveTaskIndex(command));
    java.util.ArrayList<main.java.logic.Task> result = executeTask(command, taskOptions, userInput);
    return result;
}