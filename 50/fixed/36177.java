public java.lang.String takeUserChoice() {
    java.lang.String choice;
    do {
        java.lang.System.out.println("Please specify a command [list, add, mark, archive, exit]: ");
        choice = View.input.next().toLowerCase();
    } while (!(View.possibleCommands.contains(choice)) );
    return choice;
}