public java.util.ArrayList<main.java.logic.Task> handleUserCommand(java.lang.String userInput, java.util.ArrayList<main.java.logic.Task> taskOptions) throws java.lang.Exception {
    assert userInput != null;
    main.java.logic.CommandParser parser = new main.java.logic.CommandParser();
    main.java.logic.Command command = new main.java.logic.Command(userInput);
    command = parseCommand(parser, command);
    task = createTask(command);
    java.util.ArrayList<main.java.logic.Task> result = effectTask(command, task, taskOptions);
    return result;
}