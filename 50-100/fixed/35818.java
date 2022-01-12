public boolean isRecurrenceValid(java.lang.String[] arguments) {
    if ((arguments.length) != 2) {
        return false;
    }else
        if (!(Parser.Valid.isInteger(arguments[0]))) {
            return false;
        }else {
            return commandList_.getRecurrenceArgumentList().contains(arguments[1]);
        }
    
}