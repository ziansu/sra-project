public boolean isHelpValid(java.lang.String[] arguments) {
    if ((arguments.length) == 0) {
        return true;
    }else
        if ((arguments.length) == 1) {
            return !(commandList_.getHelpArgumentList().contains(arguments[0]));
        }else {
            return false;
        }
    
}