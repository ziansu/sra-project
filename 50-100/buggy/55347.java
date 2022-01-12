public static void parse(java.lang.String command) {
    if (command.startsWith("add")) {
        week3.trees.birthdayranges.CommandParser.add(command);
    }else
        if (command.startsWith("remove")) {
            week3.trees.birthdayranges.CommandParser.remove(command);
        }else
            if (command.startsWith("count")) {
                week3.trees.birthdayranges.CommandParser.count(command);
            }else {
                throw new java.lang.IllegalArgumentException("Invalid command");
            }
        
    
}