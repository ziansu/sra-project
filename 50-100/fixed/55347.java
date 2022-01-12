public void parse(java.lang.String command) {
    if (command.startsWith("add")) {
        add(command);
    }else
        if (command.startsWith("remove")) {
            remove(command);
        }else
            if (command.startsWith("count")) {
                count(command);
            }else {
                throw new java.lang.IllegalArgumentException("Invalid command");
            }
        
    
}