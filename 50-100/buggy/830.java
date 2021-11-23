@java.lang.Override
public void execute() throws AddressBook.InvalidCommandParameterException {
    if ((parameters.get(1).length()) > 0) {
        consolePrinter.print("quiting the program.");
        java.lang.System.exit(0);
    }else {
        throw new AddressBook.InvalidCommandParameterException("the \'quit\' command does not need any parameters.");
    }
}