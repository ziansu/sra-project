public static <State extends com.ignoretheextraclub.siteswapfactory.state.AbstractState> boolean containsARepeatedState(State[] states) {
    for (int i = 0; i < (states.length); i++)
        for (int j = i + 1; j < (states.length); j++)
            if (states[i].equals(states[j]))
                return true;
            
        
    
    return false;
}