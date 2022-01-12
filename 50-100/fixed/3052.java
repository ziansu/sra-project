public boolean isDisplayValid(java.lang.String[] arguments) {
    if ((arguments.length) == 0) {
        return true;
    }else
        if ((arguments.length) == 2) {
            return (arguments[0].equals("by")) && (commandList_.getDisplayArgumentList().contains(arguments[1]));
        }
    
    return false;
}