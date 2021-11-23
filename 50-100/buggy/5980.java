private Todo.TextBuddy.CommandType getCommandType(java.lang.String command) {
    java.lang.String lowerCaseCommand = command.toLowerCase();
    switch (lowerCaseCommand) {
        case "add" :
            return Todo.TextBuddy.CommandType.ADD;
        case "delete" :
            return Todo.TextBuddy.CommandType.DELETE;
        case "display" :
            return Todo.TextBuddy.CommandType.DISPLAY;
        case "clear" :
            return Todo.TextBuddy.CommandType.CLEAR;
        case "exit" :
            return Todo.TextBuddy.CommandType.EXIT;
        case "search" :
            return Todo.TextBuddy.CommandType.SEARCH;
        case "sort" :
            return Todo.TextBuddy.CommandType.SORT;
    }
    return null;
}