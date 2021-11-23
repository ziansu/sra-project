public void execute(java.lang.String command) {
    for (int i = 0; i < (command.length()); i++) {
        switch (command.charAt(i)) {
            case Command.FORWARD :
            case Command.BACKWARD :
                if (!(move(command.charAt(i)))) {
                    return ;
                }
                break;
            case Command.RIGHT :
            case Command.LEFT :
                rotate(command.charAt(i));
                break;
        }
    }
}