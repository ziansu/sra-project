public boolean chooseAction(java.lang.String action, java.lang.StringBuilder result) throws com.umbra.vultoModule.UnknownInputException {
    boolean isAlive = false;
    java.lang.System.out.println(action);
    if (action.equalsIgnoreCase("f"))
        isAlive = chooseAction(Action.FIGHT, result);
    else
        if (action.equalsIgnoreCase("h"))
            isAlive = chooseAction(Action.HIDE, result);
        else
            if (action.equalsIgnoreCase("r"))
                isAlive = chooseAction(Action.RUN, result);
            else
                throw new com.umbra.vultoModule.UnknownInputException();
            
        
    
    return isAlive;
}